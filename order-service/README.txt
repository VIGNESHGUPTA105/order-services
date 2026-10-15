ORDER SERVICE - SPRING TOOLS SUITE

Requirements:
- JDK 17
- Eureka Server already running at http://localhost:8761

Import into Spring Tools Suite:
1. Extract this ZIP file.
2. In STS choose File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted order-service-sts folder.
4. Select its pom.xml and click Finish.
5. Right-click the project > Maven > Update Project.
6. Run OrderServiceApplication.java as Spring Boot App.

Test first instance:
http://localhost:8081/display

Run a second instance:
1. Open Run > Run Configurations.
2. Duplicate/create a Spring Boot App configuration for OrderServiceApplication.
3. In Arguments > VM arguments, enter:
   -Dserver.port=8082
4. Apply and Run.
5. Test http://localhost:8082/display

Both instances register with Eureka under the service name orderService.
The gateway must use lb://orderService to load-balance requests.
