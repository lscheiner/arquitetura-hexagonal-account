FROM openjdk:11

COPY ./target/account-0.0.1-SNAPSHOT.jar .

WORKDIR .

ENTRYPOINT ["java","-Dserver.port=${PORT}","-XX:MaxRAMPercentage=80.0","-XshowSettings:vm -version","-jar","account-0.0.1-SNAPSHOT.jar"]
