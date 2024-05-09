FROM eclipse-temurin:22
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# ======== MAVEN ========
# mvn clean
# mvn package

# ======= DOCKER =======
# docker build -t backend:1.0 .
# docker image list
# docker tag backend:1.0 pedro.cros/backend:1.0


# docker login
# hub.docker.com
# docker push pedro.cros/backend:1.0