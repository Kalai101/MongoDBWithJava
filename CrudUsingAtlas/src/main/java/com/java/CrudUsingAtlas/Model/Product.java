package com.java.CrudUsingAtlas.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
	private String productCategories;
	private String productName;
	private String productModel;
	private int productPrice;
	private String modelyear;
	private String mobile_ram;
	private String storage;
	private double display_size;
	private String front_cameraPixel;
	private String back_cameraPixel;
	private String fingerprint;
	private String mobile_color;
	private String processor;
	private String chargertype;
	private String chargewatts;
	
	public Product() {
		super();
	}

	public Product(String productCategories, String productName, String productModel, int productPrice,
			String modelyear, String mobile_ram, String storage, double display_size, String front_cameraPixel,
			String back_cameraPixel, String fingerprint, String mobile_color, String processor, String chargertype,
			String chargewatts) {
		super();
		this.productCategories = productCategories;
		this.productName = productName;
		this.productModel = productModel;
		this.productPrice = productPrice;
		this.modelyear = modelyear;
		this.mobile_ram = mobile_ram;
		this.storage = storage;
		this.display_size = display_size;
		this.front_cameraPixel = front_cameraPixel;
		this.back_cameraPixel = back_cameraPixel;
		this.fingerprint = fingerprint;
		this.mobile_color = mobile_color;
		this.processor = processor;
		this.chargertype = chargertype;
		this.chargewatts = chargewatts;
	}

	public String getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(String productCategories) {
		this.productCategories = productCategories;
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getModelyear() {
		return modelyear;
	}

	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

	public String getMobile_ram() {
		return mobile_ram;
	}

	public void setMobile_ram(String mobile_ram) {
		this.mobile_ram = mobile_ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public double getDisplay_size() {
		return display_size;
	}

	public void setDisplay_size(double display_size) {
		this.display_size = display_size;
	}

	public String getFront_cameraPixel() {
		return front_cameraPixel;
	}

	public void setFront_cameraPixel(String front_cameraPixel) {
		this.front_cameraPixel = front_cameraPixel;
	}

	public String getBack_cameraPixel() {
		return back_cameraPixel;
	}

	public void setBack_cameraPixel(String back_cameraPixel) {
		this.back_cameraPixel = back_cameraPixel;
	}

	public String isFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getMobile_color() {
		return mobile_color;
	}

	public void setMobile_color(String mobile_color) {
		this.mobile_color = mobile_color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getChargertype() {
		return chargertype;
	}

	public void setChargertype(String chargertype) {
		this.chargertype = chargertype;
	}

	public String getChargewatts() {
		return chargewatts;
	}

	public void setChargewatts(String chargewatts) {
		this.chargewatts = chargewatts;
	}

}