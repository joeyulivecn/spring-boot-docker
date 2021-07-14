# spring-boot-docker

build docker image
```
docker build -t joeyucn/spring-boot-docker:1.0 .
```

run docker container
```
docker run -p 8080:8080 joeyucn/spring-boot-docker:1.0
```

test
```
curl http://localhost:8080
```
