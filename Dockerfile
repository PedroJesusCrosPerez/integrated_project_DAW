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
LABEL author=PedroJesúsCrosPérez
# Variables de entorno para hacer dinámico el fichero 'application.properties'
ENV DATABASE_URL jdbc:mysql://mysqlpedro:3306/db_integrated_project
ENV DATABASE_USERNAME root
ENV DATABASE_PASSWORD root
ENV DATABASE_PLATFORM org.hibernate.dialect.MySQL8Dialect
ENV DATABASE_DRIVER com.mysql.cj.jdbc.Driver

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


    # No es necesario =>
# ======= DOCKER =======
# docker build -t pedro.cros/backend:1.0 .
# docker image list

# ======= DOCKER HUB =======
# docker tag backend:1.0 pedro.cros/backend:1.0
# docker login
# hub.docker.com
# docker push pedro.cros/backend:1.0