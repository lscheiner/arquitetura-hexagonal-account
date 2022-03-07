FROM openjdk:11

COPY ./target/account-0.0.1-SNAPSHOT.jar .

WORKDIR .

ENTRYPOINT ["java","-Dserver.port=${PORT}","-Xmx350m","-Xms350m","-jar","account-0.0.1-SNAPSHOT.jar"]
