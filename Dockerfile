FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring
# COPY . /usr/src/app
# WORKDIR /usr/src/app
ARG JAR_FILE
ADD ${JAR_FILE} expenses-1.0.jar
EXPOSE 8091
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","expenses-1.0.jar"]
