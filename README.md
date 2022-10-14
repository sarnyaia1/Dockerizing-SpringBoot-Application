# Dockerizing-SpringBoot-Application

1. Create project with Lombok, Web, Data MongoDB dependencies
2. docker pull mongo:latest
3. docker run -d -p 27017:27017 --name mongo-container-name mongo:latest
4. Create application files (model, repository)
5. Create application.yaml
6. Set the finalName property in pom.xml (inside build property)
7. Create Dockerfile (set the target to finalName property)
8. Run Maven install
9. Build docker image from application 
- (docker build -t builded-image:1.0 .)
10. Run the images with linking them together 
- (docker run -p 8080:8080 --name builded-image --link mongo-container-name:mongo -d builded-image:1.0) 
- OR (docker compose -> The applications image need to be built by hand before to compose!!)
11. Add items with POST method and search them with GET (Postman)