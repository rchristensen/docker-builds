
FROM jaroop/play:2.3.9

# Install MySQL 5.5
RUN export DEBIAN_FRONTEND=noninteractive && apt-get update && apt-get upgrade -y && apt-get install -q -y mysql-server-5.5

# Fix locales
RUN apt-get install -y language-pack-en-base
ENV LC_ALL en_US.UTF-8
ENV LANG en_US.UTF-8
RUN dpkg-reconfigure locales

# Install rabbitmq

RUN echo "deb http://www.rabbitmq.com/debian/ testing main" >> /etc/apt/sources.list && \
    apt-get install wget -y && \
    wget https://www.rabbitmq.com/rabbitmq-signing-key-public.asc && \
    apt-key add rabbitmq-signing-key-public.asc && \
    apt-get update && \
    apt-get install rabbitmq-server -y

ENTRYPOINT service mysql start && rabbitmq-server -detached
