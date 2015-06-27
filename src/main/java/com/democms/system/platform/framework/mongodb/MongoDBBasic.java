package com.democms.system.platform.framework.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.Arrays;



public class MongoDBBasic {
    /*****1. 填写数据库相关信息(请查找数据库详情页)*****/
    private static String databaseName = "DemoCMSLog"; //数据库名称
    private static String host = "localhost";
    private static String port = "27017";
    private static String username = "demo"; //用户AK
    private static String password = "password"; //用户SK
    private static String serverName = host + ":" + port;
    
    
    protected static void mongoDBConnector() throws UnknownHostException {

            /******2. 接着连接并选择数据库名为databaseName的服务器******/
            MongoClient mongoClient = new MongoClient(new ServerAddress(
                        serverName),
                    Arrays.asList(MongoCredential.createMongoCRCredential(
                            username, databaseName, password.toCharArray())),
                    new MongoClientOptions.Builder().cursorFinalizerEnabled(
                        false).build());
            DB mongoDB = mongoClient.getDB(databaseName);
            mongoDB.authenticate(username, password.toCharArray());

            /******至此连接已完全建立，就可对当前数据库进行相应的操作了******/
            /******3.接下来就可以使用mongo数据库语句进行数据库操作,详细操作方法请参考java-mongodb官方文档******/

            //集合并不需要预先创建
            DBCollection mongoCollection = mongoDB.getCollection("test_mongo");

            //插入数据
            DBObject data1 = new BasicDBObject();
            data1.put("no", 2007);
            data1.put("name", "this is a test message");
            mongoCollection.insert(data1);
            System.out.println(mongoCollection.getCount());
            mongoClient.close();
    }
    
    public static void main(String[] args) throws UnknownHostException{
    	mongoDBConnector();
    }
    
    
}
