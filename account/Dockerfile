FROM openjdk:11

COPY ./target/account-0.0.1-SNAPSHOT.jar .

WORKDIR .

CMD ["java","-Xmx350m","-Dserver.port=$PORT", "-Xms350m","-jar","account-0.0.1-SNAPSHOT.jar"]
