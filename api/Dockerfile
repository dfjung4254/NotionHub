FROM adoptopenjdk:11-openj9
WORKDIR /root
COPY . .
RUN ./gradlew build
CMD SPRING_PROFILES_ACTIVE=local java -jar ./build/libs/notionhub-0.0.1-SNAPSHOT.war