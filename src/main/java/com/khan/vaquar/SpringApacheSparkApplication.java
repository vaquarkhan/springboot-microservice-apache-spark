package com.khan.vaquar;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.spark.MongoSpark;
import com.mongodb.spark.config.ReadConfig;
import com.mongodb.spark.rdd.api.java.JavaMongoRDD;
/**
 * 
 * @author vaquar khan
 *
 */
@SpringBootApplication
public class SpringApacheSparkApplication{ //implements CommandLineRunner {

	private static final Logger logger = Logger.getLogger(SpringApacheSparkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringApacheSparkApplication.class, args);
	}

	
	
	
	//@Autowired
	//JavaSparkContext sc;
	/*
	@Override
	public void run(String... strings) throws Exception {

		Map<String, String> books = new HashMap<>();
		books.put("collection", "book");
		books.put("readPreference.name", "secondaryPreferred");
		//
		ReadConfig bookReadConfig = ReadConfig.create(sc.getConf()).withOptions(books);
		JavaSparkContext javaSparkContext = new JavaSparkContext(sc.getConf());
		

		JavaMongoRDD<Document> bookRdd = MongoSpark.load(javaSparkContext, bookReadConfig);
		System.out.println("========================================================================================");
		System.out.println("bookRdd="+bookRdd.first().toJson());
		System.out.println("========================================================================================");

		String matchQuery = "\"isbn\": \"1933988673\"";

		JavaRDD<Document> booksJavaRdd = bookRdd
				.withPipeline(Collections.singletonList(Document.parse("{ $match: { " + matchQuery + " } }")));

		JavaRDD<String> bookTitle = booksJavaRdd.map(singleRdd -> {
			return singleRdd.getString("title");
		});

		List<String> book = bookTitle.collect();
		long bookCount = bookTitle.count();
		System.out.println("========================================================================================");
		System.out.println("Collected book: " + book);
		System.out.println("Collected book count: " + bookCount);

		//logger.info("Collected book: " + book);
		//logger.info("Collected book count: " + bookCount);
		System.out.println("========================================================================================");
		//
	}
	*/
}
