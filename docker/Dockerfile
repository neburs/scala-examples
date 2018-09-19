FROM java:8-jdk
MAINTAINER Ruben "ruben@vasallo.nom.es"

env PATH $PATH:/scala/bin/

RUN mkdir /scala && \
    cd /scala && \
    wget https://downloads.lightbend.com/scala/2.12.6/scala-2.12.6.tgz && \
    tar -xvzf scala-2.12.6.tgz && \
    mv scala-2.12.6/* . && \
    rmdir scala-2.12.6 && \
    rm scala-2.12.6.tgz
