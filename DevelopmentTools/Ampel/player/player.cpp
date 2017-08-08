#include <sndfile.hh>

#include <portaudio.h>
#include <stdio.h>
#include <stdlib.h>
#include <fstream>
#include <sstream>
#include <iostream>


SndfileHandle file;

float* buffer;
volatile unsigned long frameCounter;


/* This routine will be called by the PortAudio engine when audio is needed.
   It may called at interrupt level on some machines so don't do anything
   that could mess up the system like calling malloc() or free().
*/ 
static int patestCallback( const void *inputBuffer, void *outputBuffer,
                           unsigned long framesPerBuffer,
                           const PaStreamCallbackTimeInfo* timeInfo,
                           PaStreamCallbackFlags statusFlags,
                           void *userData )
{
    /* Cast data passed through stream to our structure. */
    float* out = (float*)outputBuffer;
    unsigned int i;
    (void) inputBuffer; /* Prevent unused variable warning. */
    
	int frames_read = file.read (buffer, framesPerBuffer*file.channels());
	int count = frames_read;

	frameCounter += frames_read;

	while (true) {
		for( i=0; i<frames_read; i+=file.channels() )
		{
			*out++ = buffer[i];
		}
		if (count < framesPerBuffer) {
			file.seek(0, SEEK_SET);
			frames_read = file.read (buffer, (framesPerBuffer - count) * file.channels());
			frameCounter = frames_read;
			count += frames_read;
		} else {
			break;
		}
	}

	return 0;
}

void check(PaError err) {
	if (err != paNoError) {
		   printf(  "PortAudio error: %s\n", Pa_GetErrorText( err ) );
		   exit(1);  
	}
}

void set_pin(int pin, int value) {
	std::stringstream filename;
	filename << "/sys/class/gpio/gpio" << pin << "/value";
	std::ofstream myfile (filename.str().c_str());
	if (myfile.is_open()) {
		myfile << value;
	}
}

int main(int argc, char* argv[]) {
	if (argc != 3) {
		std::cerr << "player <file> <bpm>" << std::endl;
		return 1;
	}

	float bpm;
	std::stringstream ss;
	ss << argv[2];
	ss >> bpm;

	file = SndfileHandle(argv[1]);
	
	buffer = new float[256 * file.channels()];
	
	PaError err;
	err = Pa_Initialize();
	check(err);

 	PaStream *stream;

	err = Pa_OpenDefaultStream( &stream,
                                0,          /* no input channels */
                                1,          /* stereo output */
                                paFloat32,  /* 32 bit floating point output */
                                file.samplerate(),
                                256,
								patestCallback,
                                0);
	check(err);
	err = Pa_StartStream( stream );
	check(err);

	int old_position = 0;
	while (true) {
		Pa_Sleep(20);
		int position = (int)(bpm * 2 * frameCounter / file.samplerate() / file.channels() / 60);
		if (position != old_position) {
			int number = position % (1 << 3);
			int first = (number & 1) ? 1 : 0;
			int second = (number & 2) ? 1 : 0;
			int third = (number & 4) ? 1 : 0;
			
			set_pin(17, first);
			set_pin(27, second);
			set_pin(22, third);
			
			old_position = position;
		}
	}
	err=Pa_Terminate();
	check(err);
	return 0;
}


