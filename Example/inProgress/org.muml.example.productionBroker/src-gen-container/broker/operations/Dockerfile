FROM debian:sid-slim

ENV CMOCKA cmocka-1.0.1

RUN  apt-get update && apt-get install -y build-essential libcurl4-gnutls-dev curl binutils wget cmake pkg-config valgrind gcovr scons\
  && groupadd -r app && useradd -r -m -g app app \
  && apt-get autoremove -y && apt-get clean \
  && rm -rf /var/lib/apt/lists/*

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

#CMD valgrind --tool=memcheck --leak-check=full ./databaseConnector_test
CMD ./databaseConnector_test
