FROM maven:3.9.6-eclipse-temurin-21

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    gnupg \
    curl

RUN wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | gpg --dearmor -o /usr/share/keyrings/google.gpg

RUN echo "deb [arch=amd64 signed-by=/usr/share/keyrings/google.gpg] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google.list

RUN apt-get update && apt-get install -y google-chrome-stable

WORKDIR /app

COPY pom.xml .
COPY testng.xml .
COPY src ./src

CMD ["mvn","clean","test","-Dsurefire.suiteXmlFiles=testng.xml"]