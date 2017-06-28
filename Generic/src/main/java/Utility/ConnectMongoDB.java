package Utility;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajib on 1/11/2017.
 */
public class ConnectMongoDB {
    MongoDatabase mdb = null;

    public MongoDatabase connectMongoLocal(String databaseName){
        MongoClient mClient = new MongoClient();
        mdb = mClient.getDatabase(databaseName);
        System.out.println("mongodb is connected");
        return mdb;
    }

    public MongoDatabase connectMongoRemote(String host, String port,String databaseName){
        MongoClientURI mcUri = new MongoClientURI(host);
        MongoClient mClient = new MongoClient(mcUri);
        System.out.println("mongoDB Remote Connection has been established");
        mdb = mClient.getDatabase(databaseName);
        System.out.println("mongodb is connected");
        return mdb;
    }

    public void insert(String databaseName,String collectionName,String newsType, String writerName, String date){
        mdb = connectMongoLocal(databaseName);
        MongoCollection mCollection = mdb.getCollection(collectionName);
        Document doc = new Document().append("news",newsType).append("writer", writerName).append("date", date);
        mCollection.insertOne(doc);
    }

    public List<Document> getMongoDBData(String databaseName, String collectionName){
        List<Document> list = new ArrayList<Document>();
        mdb = connectMongoLocal(databaseName);
        MongoCollection coll = mdb.getCollection(collectionName);
        List<Document> docList = ((List<Document>)coll.find().into(new ArrayList<Document>()));
        for(Document doc:docList){
          list.add(doc);
        }
        return list;
    }
}