# Etapa de construcción con Maven
#    #FROM maven:4.0.0-eclipse-temurin:22 AS builder
#    FROM maven:4.0.0 AS builder
#    FROM eclipse-temurin:22 AS builder
#    WORKDIR /app
#    COPY . .
#    RUN mvn clean package -DskipTests
#
#    # Etapa final para ejecutar la aplicación Spring Boot
#    FROM eclipse-temurin:22
#    WORKDIR /app
#    COPY --from=builder /app/target/*.jar app.jar
#    ENTRYPOINT ["java", "-jar", "app.jar"]



# ======== MAVEN ========
# mvn clean
# mvn package
#    RUN mvn clean
#    RUN mvn package
#
FROM eclipse-temurin:22
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


    # No es necesario =>
# ======= DOCKER =======
# docker build -t backend:1.0 .
# docker image list
# docker tag backend:1.0 pedro.cros/backend:1.0

# ======= DOCKER HUB =======
# docker login
# hub.docker.com
# docker push pedro.cros/backend:1.0