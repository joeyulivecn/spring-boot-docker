# spring-boot-docker

build docker image
```
./gradlew bootJar && docker build -t joeyucn/spring-boot-docker:1.0 .
```

run docker container
```
docker run -p 8080:8080 joeyucn/spring-boot-docker:1.0
```

run docker container with Spring profile
```
docker run -p 8080:8080 "SPRING_PROFILES_ACTIVE=dev" joeyucn/spring-boot-docker:1.0
docker run -p 8080:8080 "SPRING_PROFILES_ACTIVE=prod" joeyucn/spring-boot-docker:1.0
```

test
```
curl http://localhost:8080
```
