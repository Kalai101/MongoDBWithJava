package com.samco.MongoSqlSpringBoot;

//import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
*/
@SpringBootApplication
public class MongoSqlSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoSqlSpringBootApplication.class, args);
		/*
		MongoClient client = MongoClients
				.create("mongodb+srv://kalaiselvan:hello@cluster.aesy1nb.mongodb.net/?retryWrites=true&w=majority");

		MongoDatabase db = client.getDatabase("employee");

		MongoCollection<Document> coll = db.getCollection("emp");
		System.out.println("Connected to Mongodb");
	}
*/}
}
