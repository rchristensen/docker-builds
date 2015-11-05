
FROM jaroop/play:2.3.9

# Install MySQL 5.5
RUN export DEBIAN_FRONTEND=noninteractive && apt-get update && apt-get upgrade -y && apt-get install -q -y mysql-server-5.5
CMD ["service", "mysql", "start"]

# Fix locales
RUN apt-get install -y language-pack-en-base
ENV LC_ALL en_US.UTF-8
ENV LANG en_US.UTF-8
RUN dpkg-reconfigure locales
