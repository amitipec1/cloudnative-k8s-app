FROM openjdk:8
RUN mkdir -p /usr/myapp
WORKDIR /usr/myapp/
ADD target/myapp-0.0.1-SNAPSHOT.jar .
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n
EXPOSE 8080
ENTRYPOINT [ "java","-jar","-Dspring.profiles.active=dev","myapp-0.0.1-SNAPSHOT.jar"]