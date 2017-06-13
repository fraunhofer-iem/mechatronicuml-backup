FROM dds

ADD . /opt/app
RUN chown app:app -R /opt/app

WORKDIR /opt/app
USER app

RUN make

CMD ./app
