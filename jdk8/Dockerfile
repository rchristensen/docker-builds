
FROM ubuntu:trusty

RUN rm /bin/sh && ln -s /bin/bash /bin/sh

RUN apt-get update
RUN apt-get install -y git build-essential curl wget software-properties-common

RUN \
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
add-apt-repository -y ppa:webupd8team/java && \
apt-get update && \
apt-get install -y oracle-java8-installer wget unzip tar && \
rm -rf /var/lib/apt/lists/* && \
rm -rf /var/cache/oracle-jdk8-installer

ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
