package com.samco.MongoDbProject1.ProductModel;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Product {

	private String productId;
	private String productName;
	private String productModel;
	private String productPrice;

	public Product() {
		super();
	}

	public Product(String productId, String productName, String productModel, String productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productModel = productModel;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
