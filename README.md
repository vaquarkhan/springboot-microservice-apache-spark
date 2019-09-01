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


2) Connect with spark adn mongodb using spark connector 


3) Write rest api to get call and fetch data 
