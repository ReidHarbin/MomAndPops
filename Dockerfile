FROM maven:3.9.11-amazoncorretto-25 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM amazoncorretto:25
COPY --from=build /target/restaurant-0.0.1-SNAPSHOT.jar restaurant.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restaurant.jar"]