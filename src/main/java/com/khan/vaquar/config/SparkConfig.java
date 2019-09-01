package com.khan.vaquar.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author vaquar khan
 *
 */
@Configuration
public class SparkConfig {

	@Value("${spark.app.name}")
	private String appName;
	@Value("${spark.master}")
	private String masterUri;
	@Value("${spring.data.mongodb.uri}")
	private String mongoDbConnectionUri;
	@Value("${spring.data.mangodb.input.url}")
	private String mangoInputUri;
	@Value("${spring.data.mangodb.output.url}")
	private String mangoOutputUri;
	@Value("${spark.driver.host}")
	private String sparkDriverHost;
	@Value("${spark.driver.allowMultipleContexts}")
	private String sparkAllowMultipleContexts;
	@Value("${spark.testing.memory}")
	private String sparkTestngMemory;

	@Bean
	public SparkConf conf() {
		return new SparkConf()
				.setMaster(masterUri)
				.setAppName(appName)
				.set("spark.mongodb.input.uri", mangoInputUri)
				.set("spark.mongodb.output.uri", mangoOutputUri)
				.set("spark.driver.host", sparkDriverHost)
				.set("spark.driver.allowMultipleContexts", sparkAllowMultipleContexts)
				.set("spark.testing.memory", sparkTestngMemory);

	}

	@Bean
	public JavaSparkContext sc() {
		return new JavaSparkContext(conf());
	}

}
