FROM debian:sid-slim

ENV VERSION 5.2.3
ENV NDDSHOME /y/rti_connext_dds-${VERSION}/

ADD http://s3.amazonaws.com/RTI/Bundles/5.2.3/Evaluation/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run /opt/dds/

RUN apt-get update && apt-get install -y build-essential libcurl4-gnutls-dev curl sqlite3 \
  && groupadd -r app && useradd -r -m -g app app \
  && chmod +x /opt/dds/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run  \
  && yes | /opt/dds/rti_connext_dds-${VERSION}-eval-x64Linux3gcc4.8.2.run \
  && apt-get autoremove -y && apt-get clean \
  && rm -rf /var/lib/apt/lists/*

ADD rti_license.dat /y/rti_connext_dds-${VERSION}/
