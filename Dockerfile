FROM openjdk:11
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8099
CMD ["java","-jar","demo.jar"]
