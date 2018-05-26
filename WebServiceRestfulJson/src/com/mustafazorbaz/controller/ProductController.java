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
		Product product1=new Product(1, "Konfulon 2 li Priz Dönüþtürücü ve USB Þarj", "ÜCRETSÝZ KARGO", 49.90, "Konfulon duvar pirizi sayesinde Avrupa, Amerika ve ingiliz þarj cihazlarýnýzýn uçlarýný herhangi bir dönüþtürücüye ihtiyaç kalmadan kullanabilirsiniz. Ayrýca piriz üzerinde 2 adet usb çýkýþ sayesinde þarj cihazýna ihtiyaç duymadan cihazlarýnýzý baðlayarak direkt þarj yapabilirsiniz. USB giriþler toplamda 2.4A güç saðlamaktadýr ayný anda bir tablet ve telefon þarj edebilirsiniz. Priz üzerinde açma kapama tuþu mevcuttur.Çalýþma sýcaklýðý -10 , +40 derecedir.öne çýkan özellikler Kaliteli malzeme Ergonomik tasarým", 64894);

		return product1;
	}
	private ProductList createProductList() {
		Product product1=new Product(1, "Konfulon 2 li Priz Dönüþtürücü ve USB Þarj", "ÜCRETSÝZ KARGO", 49.90, "Konfulon duvar pirizi sayesinde Avrupa, Amerika ve ingiliz þarj cihazlarýnýzýn uçlarýný herhangi bir dönüþtürücüye ihtiyaç kalmadan kullanabilirsiniz. Ayrýca piriz üzerinde 2 adet usb çýkýþ sayesinde þarj cihazýna ihtiyaç duymadan cihazlarýnýzý baðlayarak direkt þarj yapabilirsiniz. USB giriþler toplamda 2.4A güç saðlamaktadýr ayný anda bir tablet ve telefon þarj edebilirsiniz. Priz üzerinde açma kapama tuþu mevcuttur.Çalýþma sýcaklýðý -10 , +40 derecedir.öne çýkan özellikler Kaliteli malzeme Ergonomik tasarým", 64894);
		Product product2=new Product(2, "Baseus Zinc Type C Hýzlý Þarj Kablosu Type C Hýzlý Þarj Kablosu", "ÜCRETSÝZ KARGO", 59.90, "Baseus Type C þarj kablosu, yüksek kaliteli ve son derece saðlam bir kablodur. Type C giriþli cihazlarý kolaylýkla þarj ve ilgili cihazlar arasý senkronize edebilirsiniz. Teknolojisi sayesinde hýzlý þarj ve data transferine olanak saðlar. 480Mbps transfer hýzý ve 2A þarj desteði sunar. Kablo karýþmasýný önleyen yassý þekilde üretilmiþtir. Dýþ yüzeyi çelik örgü ile kaplanmýþ bu sayede kopmalara karþý kuvvetlendirilmiþtir. Baþlýk kýsýmlarý alüminyumdan üretilmiþtir.",46999);
		Product product3=new Product(3, "MQD32TU/A Apple MacBook Air 13-inch 1.8GHz dual Core i5 128GB", "ÜCRETSÝZ KARGO", 3.4799 , "MacBook Air 13-inch: 1.8GHz dual-core Intel Core i5, 128GB",5698);
		Product product4=new Product(4, "Western Digital Green 2.5'' 120GB WDS120G2G0A SSD", "ÜCRETSÝZ KARGO",165.99,"Hýzlý performans ve güvenilirlik için WD Green SSD'ler masaüstü veya dizüstü bilgisayarýnýzdaki günlük bilgisayar kullanýmý deneyimini arttýrýr.Günlük bilgisayar kullanýmý için geliþtirilmiþ performans WD Green SATA SSD performansýyla web'te gezinebilir, oyun oynayabilir veya sistemi bir anda baþlatabilirsiniz.",5698);
		Product product5=new Product(5, "Windows 10 Pro 32/64 Bit Türkçe Orjinal Lisans TR 32&64 bit", "ÜCRETLÝ KARGO",15.99,"Ömür Boyu Kullaným Herhangi bir kullaným süresi veya kýsýtlamasý yoktur",5698);
		
		List productList=new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		return new ProductList(productList);
	}
}
