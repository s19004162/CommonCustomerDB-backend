FROM eclipse-temurin:11-jdk-alpine
ARG JAR_FILE=target/cmcustdb-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-XX:StartFlightRecording=dumponexit=true,filename=/var/log/jfr.log", "-XX:FlightRecorderOptions=memorysize=100M", "-jar","/app.jar"]