# Spring-boot-microservice-apache-spark-Mongodb-reactive-rest

#WIP

## MongoDb:

Advantages of using mongodb ( as per tutorialspoint article)

#### Advantages of MongoDB over RDBMS

- Schema less − MongoDB is a document database in which one collection holds different documents. Number of fields, content and size of the document can differ from one document to another.

- Structure of a single object is clear.

- No complex joins.

- Deep query-ability. MongoDB supports dynamic queries on documents using a document-based query language that's nearly as powerful as SQL.

- Tuning.

- Ease of scale-out − MongoDB is easy to scale.

- Conversion/mapping of application objects to database objects not needed.

- Uses internal memory for storing the (windowed) working set, enabling faster access of data.

#### Why Use MongoDB?

- Document Oriented Storage − Data is stored in the form of JSON style documents.

- Index on any attribute

- Replication and high availability

- Auto-sharding

- Rich queries

- Fast in-place updates

- Professional support by MongoDB

#### Where to Use MongoDB?
- Big Data
- Content Management and Delivery
- Mobile and Social Infrastructure
- User Data Management
- Data Hub

#### Where not to use

- Not strongly ACID-compliant (Atomic, Consistency, Isolation, Durability) as the more well-established RDBMS systems.
Complex transaction
- No function or stored procedure exists where you can bind the logic

#### RDBMS vs MangoDB

![Alt Text](https://hackernoon.com/hn-images/1*z4srDtG5sSvBCvLqd5Jj-Q.png)


1) Import dataset into mangodb

- https://docs.mongodb.com/compass/master/import-export/


![Alt Text](https://github.com/vaquarkhan/springboot-microservice-apache-spark/blob/master/image/Mango-dataset.PNG)

#### Write dataframe into mangodb

- https://docs.mongodb.com/spark-connector/master/python/write-to-mongodb/


2) Connect with spark and mongodb using spark connector 


3) Write rest api to get call and fetch data 

calling url :

http://localhost:8080/books/test

## Spring 5 Reactive referance

- [Introduction to the Functional Web Framework in Spring 5](http://www.baeldung.com/spring-5-functional-web)
- [Spring 5 WebClient](http://www.baeldung.com/spring-5-webclient)
- [Exploring the Spring 5 WebFlux URL Matching](http://www.baeldung.com/spring-5-mvc-url-matching)
- [Reactive WebSockets with Spring 5](http://www.baeldung.com/spring-5-reactive-websockets)
- [Spring Webflux Filters](http://www.baeldung.com/spring-webflux-filters)
- [How to Set a Header on a Response with Spring 5](http://www.baeldung.com/spring-response-header)
- [Spring Webflux and CORS](http://www.baeldung.com/spring-webflux-cors)
- [Handling Errors in Spring WebFlux](http://www.baeldung.com/spring-webflux-errors)
- [Server-Sent Events in Spring](https://www.baeldung.com/spring-server-sent-events)
- [A Guide to Spring Session Reactive Support: WebSession](https://www.baeldung.com/spring-session-reactive)
- [Validation for Functional Endpoints in Spring 5](https://www.baeldung.com/spring-functional-endpoints-validation)
- [Logging a Reactive Sequence](https://www.baeldung.com/spring-reactive-sequence-logging)
- [Testing Reactive Streams Using StepVerifier and TestPublisher](https://www.baeldung.com/reactive-streams-step-verifier-test-publisher)
- [Debugging Reactive Streams in Spring 5](https://www.baeldung.com/spring-debugging-reactive-streams)
- [Static Content in Spring WebFlux](https://www.baeldung.com/spring-webflux-static-content)

