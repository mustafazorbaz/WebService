package com.mustafazorbaz.domain;
 
 /**
  * 
  * @author Mustafa
  *
  */
public class Product {

	private int productId;
	private String productName;
	private String productDeliveryInformation;
	private double productPrice;
	private String productInformation;
	private int productStoreId;
	
	public Product()
	{
		
	}
	public Product(int productId, String productName, String productDeliveryInformation, double productPrice,
			String productInformation, int productStoreId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDeliveryInformation = productDeliveryInformation;
		this.productPrice = productPrice;
		this.productInformation = productInformation;
		this.productStoreId = productStoreId;
	}
	  
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	} 
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	 
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	} 
	public String getProductInformation() {
		return productInformation;
	}
	public void setProductInformation(String productInformation) {
		this.productInformation = productInformation;
	} 
	public int getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(int productStoreId) {
		this.productStoreId = productStoreId;
	} 
	public String getProductDeliveryInformation() {
		return productDeliveryInformation;
	}
	public void setProductDeliveryInformation(String productDeliveryInformation) {
		this.productDeliveryInformation = productDeliveryInformation;
	}

}
