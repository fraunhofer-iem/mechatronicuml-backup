import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LOCCounter {

	private int loc = 0;
	private int whitelines = 0;

	public LOCCounter() {
	}

	public static void main(String[] args) throws IOException {
		LOCCounter counter = new LOCCounter();
		counter.run(args[0]);
		counter.print();
	}

	private void print() {
		System.out.println("LOC: " + loc);
		System.out.println("WHITE: " + whitelines);
		System.out.println("SLOC: " + (loc - whitelines));
	}

	public void run(String filename) throws IOException {
		File file = new File(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		try {
			String line;
			while (null != (line = br.readLine())) {
				process(line);
			}
		} finally {
			br.close();
		}
	}

	private void process(String line) {
		loc++;
		if (line.replace("\t", "").replace(" ", "").replace("\n", "").replace("\r", "").isEmpty()) {
			whitelines++;
		}
	}

}
