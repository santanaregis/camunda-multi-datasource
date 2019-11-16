FROM openjdk:11
EXPOSE 8080
ADD /build/libs/*.jar /opt/api.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /opt/api.jar
