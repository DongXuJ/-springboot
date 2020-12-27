FROM java:8
VOLUME /tmp
ADD demok8s-0.0.1-SNAPSHOT.jar /demo1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo1.jar"]