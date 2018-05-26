package com.mustafazorbaz.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.mustafazorbaz.domain.Product;
import com.mustafazorbaz.domain.ProductList;
/**
 * 
 * @author Mustafa
 *
 */
@RestController 
public class ProductController {

	@RequestMapping(value="/product/{id}",method=RequestMethod.GET,headers="Accept=application/json")
	public Product getProduct(@PathVariable int id) {
		List listOfProduct=new ArrayList();
		ProductList productList=createProductList();
		listOfProduct=productList.getProductList();
		System.out.println(listOfProduct);
		 for (int i = 0; i < listOfProduct.size(); i++) {
			  Product product = (Product) listOfProduct.get(i);
			  if(product.getProductId()==id)
				    return product;  
		  }
		 return null;
	}
	@RequestMapping(value="/products",method=RequestMethod.GET,headers="Accept=application/json")
	public ProductList getProductList(){
		 
		  return  createProductList();
	}
	@RequestMapping(value="/test",method=RequestMethod.GET , headers = "Accept=application/json")
	public Product test(){
		Product product1=new Product(1, "Konfulon 2 li Priz D�n��t�r�c� ve USB �arj", "�CRETS�Z KARGO", 49.90, "Konfulon duvar pirizi sayesinde Avrupa, Amerika ve ingiliz �arj cihazlar�n�z�n u�lar�n� herhangi bir d�n��t�r�c�ye ihtiya� kalmadan kullanabilirsiniz. Ayr�ca piriz �zerinde 2 adet usb ��k�� sayesinde �arj cihaz�na ihtiya� duymadan cihazlar�n�z� ba�layarak direkt �arj yapabilirsiniz. USB giri�ler toplamda 2.4A g�� sa�lamaktad�r ayn� anda bir tablet ve telefon �arj edebilirsiniz. Priz �zerinde a�ma kapama tu�u mevcuttur.�al��ma s�cakl��� -10 , +40 derecedir.�ne ��kan �zellikler Kaliteli malzeme Ergonomik tasar�m", 64894);

		return product1;
	}
	private ProductList createProductList() {
		Product product1=new Product(1, "Konfulon 2 li Priz D�n��t�r�c� ve USB �arj", "�CRETS�Z KARGO", 49.90, "Konfulon duvar pirizi sayesinde Avrupa, Amerika ve ingiliz �arj cihazlar�n�z�n u�lar�n� herhangi bir d�n��t�r�c�ye ihtiya� kalmadan kullanabilirsiniz. Ayr�ca piriz �zerinde 2 adet usb ��k�� sayesinde �arj cihaz�na ihtiya� duymadan cihazlar�n�z� ba�layarak direkt �arj yapabilirsiniz. USB giri�ler toplamda 2.4A g�� sa�lamaktad�r ayn� anda bir tablet ve telefon �arj edebilirsiniz. Priz �zerinde a�ma kapama tu�u mevcuttur.�al��ma s�cakl��� -10 , +40 derecedir.�ne ��kan �zellikler Kaliteli malzeme Ergonomik tasar�m", 64894);
		Product product2=new Product(2, "Baseus Zinc Type C H�zl� �arj Kablosu Type C H�zl� �arj Kablosu", "�CRETS�Z KARGO", 59.90, "Baseus Type C �arj kablosu, y�ksek kaliteli ve son derece sa�lam bir kablodur. Type C giri�li cihazlar� kolayl�kla �arj ve ilgili cihazlar aras� senkronize edebilirsiniz. Teknolojisi sayesinde h�zl� �arj ve data transferine olanak sa�lar. 480Mbps transfer h�z� ve 2A �arj deste�i sunar. Kablo kar��mas�n� �nleyen yass� �ekilde �retilmi�tir. D�� y�zeyi �elik �rg� ile kaplanm�� bu sayede kopmalara kar�� kuvvetlendirilmi�tir. Ba�l�k k�s�mlar� al�minyumdan �retilmi�tir.",46999);
		Product product3=new Product(3, "MQD32TU/A Apple MacBook Air 13-inch 1.8GHz dual Core i5 128GB", "�CRETS�Z KARGO", 3.4799 , "MacBook Air 13-inch: 1.8GHz dual-core Intel Core i5, 128GB",5698);
		Product product4=new Product(4, "Western Digital Green 2.5'' 120GB WDS120G2G0A SSD", "�CRETS�Z KARGO",165.99,"H�zl� performans ve g�venilirlik i�in WD Green SSD'ler masa�st� veya diz�st� bilgisayar�n�zdaki g�nl�k bilgisayar kullan�m� deneyimini artt�r�r.G�nl�k bilgisayar kullan�m� i�in geli�tirilmi� performans WD Green SATA SSD performans�yla web'te gezinebilir, oyun oynayabilir veya sistemi bir anda ba�latabilirsiniz.",5698);
		Product product5=new Product(5, "Windows 10 Pro 32/64 Bit T�rk�e Orjinal Lisans TR 32&64 bit", "�CRETL� KARGO",15.99,"�m�r Boyu Kullan�m Herhangi bir kullan�m s�resi veya k�s�tlamas� yoktur",5698);
		
		List productList=new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		return new ProductList(productList);
	}
}
