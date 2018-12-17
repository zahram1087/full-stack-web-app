<!-- What approach did you take? -->
I approached this lab reviewing how to do a controller.I also reviewed thymleaf dialects.


<!-- Description of each method publicly available to your Stack and Queue-->
##AlbumController CLASS:
1. A user should be able to see information about all the albums on the site.
2. A user should be able to add albums to the site.
3. RequestMapping to render a DB
"http://localhost:8080/albums"

##Runing App:

##1.Load the following application properties:

    spring.datasource.platform=postgres
    spring.datasource.url=jdbc:postgresql://localhost:YOUR_DATABASE_NUMBER/DATABASE_NAME
    spring.datasource.username=USER_NAME
    spring.datasource.password=PASSWORD

2. Remember to remove the spring.jpa.hibernate.ddl-auto = create from the application properties after the first run so that database doesn't get wiped clean
3. Run ./gradlew bootRun
4. Go to:
    http://localhost:8080/albums -to get started





