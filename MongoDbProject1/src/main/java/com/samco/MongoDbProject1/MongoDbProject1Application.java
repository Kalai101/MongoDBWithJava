package com.samco.MongoDbProject1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.samco.MongoDbProject1.ProductModel.Product;


@SpringBootApplication
public class MongoDbProject1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbProject1Application.class, args);
		MongoClientURI uri = new MongoClientURI("mongodb+srv://kalaiselvan:hello@cluster.aesy1nb.mongodb.net/?retryWrites=true&w=majority");

		try (MongoClient mongoClient = new MongoClient(uri)) {
			@SuppressWarnings("deprecation")
			DB db = mongoClient.getDB("Products");
			DBCollection col = db.getCollection("product_info");

			

			Product product = new Product();
			product.setProductId("01");
			product.setProductName("OPPO");
			product.setProductModel("OPPOA5"); 
			product.setProductPrice("10000");
		
			/*
			 * Scanner sc = new Scanner(System.in);
			 * 
			 * product.setProductId(sc.nextLine()); product.setProductName(sc.nextLine());
			 * product.setProductModel(sc.nextLine());
			 * product.setProductPrice(sc.nextLine());
			 */
			
			Gson gson = new Gson();
			String json = gson.toJson(product);
			BasicDBObject basicDBObject = new BasicDBObject("products", json);
			col.save(basicDBObject);
			

		}catch(Exception e) { 
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
			
			
		}
	}


