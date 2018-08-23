# Common Booking Service

## How to run:

```
mvn exec:java
```

* How to see the results:

```
mvn generate-sources
```
	- this will generate wsdl file and will be located at ('project/wsdl')
	
```
run SOAP UI and create a new SOAP Project using the generated wsdl
```

```
change the URL to the one you set in the main class.
```

## Highlights of the solution:

This solution is made from scratch. 
It was patterned from the tutorial at "http://www.baeldung.com/introduction-to-apache-cxf"

* All responses are hard-coded.

