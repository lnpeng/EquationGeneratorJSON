# EquationGeneratorJSON
A RESTful equation generator that returns JSON.

# Description
EquationGeneratorJSON is a RESTful web service that generates random arithmetic equations of type `Equation`. The client requests the web serivice with addition, subtraction or multiplication and the skill level of the user (1 specifies equations using numbers from 1 to 9, 2 specifies equaitons using numbers from 10 to 99, and 3 specifies equations using numbers from 100 to 999). The web service then generates an equation consisting of random numbers in the proper range. 

Class `Equaiton` is identically defined in both server-side and client-side. Fasterxml/jackson-databind is used for both serialization and deserialization of an `Equation` instance. The web servie uses JAX-RS 2.1 for mapping a web resource to a resource class. Web service framework is Jersey 2.27.

# Getting Started
## Prerequisites
- JDK 1.8
- Jersey 2.27 - Implements JAX-RS 2.1 API 
- org.glassfish.jersey.media:jersey-media-json-jacksonn - Jersey JSON Jackson (2.x) entity providers support module.
- org.glassfish.jersey.inject:jersey-hk2 - HK2 InjectionManager implementation.
## Installing
```
git clone git@github.com:lnpeng/EquationGeneratorJSON.git
cd EquationGeneratorJSON
```
## Running the tests
### Test the RESTful equation generator in Web Browser
```
http://localhost:8080/EquationGenerator-1.0-SNAPSHOT/EquationGeneratorJSON/equation/add/1
```
Expect to see a JSON response. For example,
```
{
  "leftOperand": 7,
  "rightOperand": 2,
  "result": 9,
  "operationType": "+",
  "leftHandSide": "7 + 2",
  "rightHandSide": "9"
}
```

## Deployment
Deploy the war file to [Tomcat](http://tomcat.apache.org/) Java Servlet container.

# Build
- [Maven](https:maven.apache.org) - Dependency Management.
