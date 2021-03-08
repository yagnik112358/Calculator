FROM openjdk:8
COPY ./target/Calculator-1.0-SNAPSHOT.war ./
WORKDIR ./
CMD ["java", "-cp", "Calculator-1.0-SNAPSHOT.war", "Main"]