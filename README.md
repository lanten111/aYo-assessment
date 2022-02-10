# aYo-assessment
aYo assessment repository



1. # End points for convention
   - #### Miters to Feet
     ````
       GET http://localhost:8080/convention/miters-to-feet?miters=?
     ````
       - #### Feet to Miters
     ````
       GET http://localhost:8080/convention/feet-to-miter?feet=?
     ````
       - #### Celcius to Fahrenheit
     ````
       GET http://localhost:8080/convention/celcius-to-fahrenheit?celcius=?
     ````
       - #### Fahrenheit to celcius
     ````
      GET http://localhost:8080/convention/fahrenheit-to-celcius?fahrenheit=10
     ````
       - #### PSI to Bar
     ````
       GET http://localhost:8080/convention/psi-to-bar?psi=?
     ````
       - #### Bar to psi
     ````
       GET http://localhost:8080/convention/bar-to-psi?bar=?
     ````
       - #### Kilogram to Pounds
     ````
       GET http://localhost:8080/convention/kilogram-to-pounds?kilogram=?
     ````
       - #### Pounds to kilogram
     ````
       GET http://localhost:8080/convention/pounds-to-kilogram?pounds=?
     ````

       - #### Gallons to Pounds
     ````
       GET http://localhost:8080/convention/gallons-to-liters?gallons=?
     ````
       - #### Liters to gallons
     ````
       GET http://localhost:8080/convention/liters_to_gallons?liters=?
     ````
   
2# How to Run the project

- To run the project, use  mvn spring-boot:run this will build the project then start up
- Client will be Postman or if on Intellij, there is `test-requests.http` file under `/test` with all endpoint and data ready
- the project will start on port 8080 unless changed on property file
- full context path `localhost:8080/convention/`
- For Docker, there is docker file already. Just run `mvn package` 
  it will create jar file then create docker image with `docker build -t springio/gs-spring-boot-docker .`


3# Test
- Added test to test all service layer on all convention
- To run th tests, use ` maven test`
    
4# Tech used
- Maven
- Springboot
- GitHub


