FROM dds

ADD . /opt/app
ADD entrypoint.sh /usr/bin/
RUN  chmod +x /usr/bin/entrypoint.sh \
     && chown app:app -R /opt/app

WORKDIR /opt/app
USER app

RUN make

ENTRYPOINT ["/usr/bin/entrypoint.sh"]

CMD ./app
