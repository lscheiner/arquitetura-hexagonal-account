FROM openjdk:11

COPY ./target/account-0.0.1-SNAPSHOT.jar .

WORKDIR .

CMD ["java","-Xmx400m", "-Xms400m","-jar","account-0.0.1-SNAPSHOT.jar"]
