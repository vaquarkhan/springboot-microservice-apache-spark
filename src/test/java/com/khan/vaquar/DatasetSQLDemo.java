package com.khan.vaquar;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.mongodb.spark.MongoSpark;
/**
 * 
 * @author vaquar khan
 * 
{ "_id" : ObjectId("585024d558bef808ed84fc3e"), "name" : "Bilbo Baggins", "age" : 50 }
{ "_id" : ObjectId("585024d558bef808ed84fc3f"), "name" : "Gandalf", "age" : 1000 }
{ "_id" : ObjectId("585024d558bef808ed84fc40"), "name" : "Thorin", "age" : 195 }
{ "_id" : ObjectId("585024d558bef808ed84fc41"), "name" : "Balin", "age" : 178 }
{ "_id" : ObjectId("585024d558bef808ed84fc42"), "name" : "Kíli", "age" : 77 }
{ "_id" : ObjectId("585024d558bef808ed84fc43"), "name" : "Dwalin", "age" : 169 }
{ "_id" : ObjectId("585024d558bef808ed84fc44"), "name" : "Óin", "age" : 167 }
{ "_id" : ObjectId("585024d558bef808ed84fc45"), "name" : "Glóin", "age" : 158 }
{ "_id" : ObjectId("585024d558bef808ed84fc46"), "name" : "Fíli", "age" : 82 }
{ "_id" : ObjectId("585024d558bef808ed84fc47"), "name" : "Bombur" }
 *
 */

public final class DatasetSQLDemo {

  public static void main(final String[] args) throws InterruptedException {

    SparkSession spark = SparkSession.builder()
      .master("local")
      .appName("MongoSparkConnectorIntro")
      .config("spark.mongodb.input.uri", "mongodb://127.0.0.1/test.myCollection")
      .config("spark.mongodb.output.uri", "mongodb://127.0.0.1/test.myCollection")
      .getOrCreate();

    // Create a JavaSparkContext using the SparkSession's SparkContext object
    JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());

    // Load data and infer schema, disregard toDF() name as it returns Dataset
    Dataset<Row> implicitDS = MongoSpark.load(jsc).toDF();
    implicitDS.printSchema();
    implicitDS.show();

    // Load data with explicit schema
    Dataset<Character> explicitDS = MongoSpark.load(jsc).toDS(Character.class);
    explicitDS.printSchema();
    explicitDS.show();

    // Create the temp view and execute the query
    explicitDS.createOrReplaceTempView("characters");
    Dataset<Row> centenarians = spark.sql("SELECT name, age FROM characters WHERE age >= 100");
    centenarians.show();

    // Write the data to the "hundredClub" collection
    MongoSpark.write(centenarians).option("collection", "hundredClub").mode("overwrite").save();

    // Load the data from the "hundredClub" collection
  //TODO  MongoSpark.load(sparkSession, ReadConfig.create(sparkSession).withOption("collection", "hundredClub"), Character.class).show();

    jsc.close();

  }
}
