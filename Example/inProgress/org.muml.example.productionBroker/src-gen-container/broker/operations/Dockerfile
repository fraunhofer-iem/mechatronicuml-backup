FROM dds

ENV CMOCKA cmocka-1.0.1

RUN apt-get update \
	&& apt-get install -y wget \
	cmake \
	gcovr \
	scons \
	curl \
	&& rm -rf /car/lib/apt/lists/*

RUN wget https://cmocka.org/files/1.0/${CMOCKA}.tar.xz && \
	tar -xf ${CMOCKA}.tar.xz && cd ${CMOCKA} && \
	mkdir build && cd build && cmake -G "Unix Makefiles" .. && \
	make && make install && \
	cd ../.. && rm -rf cmocka* && ldconfig

ADD . /opt/app


WORKDIR /opt/app/build
USER app


RUN cmake .. && make  

#ENTRYPOINT ["/usr/bin/entrypoint.sh"]

CMD ./databaseConnector_test
