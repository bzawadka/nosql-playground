import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Date;

public class MongoApp {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("mkyong");
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("users");
        insertDocument(mongoCollection);
        listDocuments(mongoCollection);
    }

    private static void insertDocument(MongoCollection<Document> mongoCollection) {
        Document document = new Document();
        document.put("username", "bart");
        document.put("password", "man");
        document.put("createdDate", new Date());
        mongoCollection.insertOne(document);
    }

    private static void listDocuments(MongoCollection<Document> mongoCollection) {
        for (Document document : mongoCollection.find()){
            System.out.println(document.get("username") + " identified by " + document.get("password") + " at " + document.get("createdDate"));
        }
    }
}
