FROM openjdk:11

COPY ./target/account-0.0.1-SNAPSHOT.jar .

WORKDIR .

ENV JAVA_OPTS=-Dserver.port=$PORT -Xmx350m -Xms350m

ENTRYPOINT ["java","${JAVA_OPTS}","-jar","account-0.0.1-SNAPSHOT.jar"]
