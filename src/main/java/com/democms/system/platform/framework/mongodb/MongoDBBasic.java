package com.democms.system.platform.framework.mongodb;

import com.democms.system.platform.framework.util.SpringPropertyResourceReader;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.Arrays;



public class MongoDBBasic {
    private static String databaseName = "DemoCMSLog"; //数据库名称
    private static String host = "localhost";
    private static String port = "27017";
    private static String username = "demo"; //用户AK
    private static String password = "password"; //用户SK
    private static String serverName = host + ":" + port;
    
	public static DB getNewMongoClient() throws UnknownHostException {
		
		databaseName = SpringPropertyResourceReader.getProperty("mongodb.name");
		host = SpringPropertyResourceReader.getProperty("mongodb.url");
		port = SpringPropertyResourceReader.getProperty("mongodb.port");
		username = SpringPropertyResourceReader.getProperty("mongodb.user");
		password = SpringPropertyResourceReader.getProperty("mongodb.password");
		serverName = host + ":" + port;
		
		MongoClient mongoClient = new MongoClient(
				new ServerAddress(serverName), Arrays.asList(MongoCredential
						.createMongoCRCredential(username, databaseName,
								password.toCharArray())),
				new MongoClientOptions.Builder().cursorFinalizerEnabled(false)
						.build());
		DB mongoDB = mongoClient.getDB(databaseName);
		mongoDB.authenticate(username, password.toCharArray());
		return mongoDB;
	} 
}
