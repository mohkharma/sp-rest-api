# REST-API Project
Sample REST project

### package the project
```bash
.\mvnw clean package -DskipTests
```
###  To run the project
```bash
java -jar .\target\rest-api-0.0.1-SNAPSHOT.jar
```
#### OR
```bash
.\mvnw spring-boot:run
```
### Build docker image
```bash
docker build -t rest-api .
```
### Run docker image
```bash
docker run --name rest-api -p 127.0.0.1:8080:8080 rest-api
```
### Check for running containers
```bash
docker ps -a
```
### Remove container by ID
```bash
docker rm 8717c6955355
```



## License
[MIT](https://choosealicense.com/licenses/mit/)