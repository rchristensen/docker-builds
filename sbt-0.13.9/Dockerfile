
FROM jaroop/ubuntu-openjdk8

# Install sbt
RUN wget https://dl.bintray.com/sbt/debian/sbt-0.13.9.deb
RUN dpkg -i sbt-0.13.9.deb
RUN rm sbt-0.13.9.deb

# Download sbt and compiler jars
COPY sample /root/sample
COPY install.bash ./
RUN bash install.bash
