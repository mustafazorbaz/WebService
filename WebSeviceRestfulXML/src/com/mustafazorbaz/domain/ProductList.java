package com.mustafazorbaz.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product-list")
public class ProductList {
	List productList;

	public ProductList(List productList) {
		 this.productList=productList;
	}
	public void setProductList(List productList) {
	    this.productList=productList;
	}
	@XmlElement(name = "product", type=Product.class)
	public List getProductList() {
		return productList;
	} 
	
	public ProductList() {
	 super();
	}
  
}
