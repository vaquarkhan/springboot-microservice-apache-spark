package com.khan.vaquar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkConnectionTest {

	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("ApacheSparkApp").setMaster("local[2]")
		.set("spark.driver.host", "localhost");
		conf.set("spark.testing.memory", "2147480000");
		//
		JavaSparkContext sc = new JavaSparkContext(conf);
		List<String> word = new ArrayList<>();
		word.add("ha");
		JavaRDD<String> words = sc.parallelize(Arrays.asList("khan", "vaquarmohammed","hahanahana"));
		Map<String, Long> wordCounts = words.countByValue();
		System.out.println("=================================================================================================");
		wordCounts.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("=================================================================================================");
		//
		
		sc.close();
	}

}
