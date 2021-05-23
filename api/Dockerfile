FROM adoptopenjdk:11-openj9
WORKDIR /root
ENV RUN_MODE=local
COPY . .
RUN ./gradlew build
CMD SPRING_PROFILES_ACTIVE=${RUN_MODE} java -jar ./build/libs/notionhub-0.0.1-SNAPSHOT.war
