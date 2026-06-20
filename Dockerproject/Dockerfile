FROM maven:3.9.6-eclipse-temurin-17

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    chromium \
    chromium-driver

WORKDIR /app

COPY . .

RUN mvn clean test-compile

CMD ["mvn","test"]