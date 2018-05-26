package com.mustafazorbaz.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country-list")
public class CountryList {
	
	List listOfCountries;
	
	public CountryList() {
	 super();
	}
	public CountryList(List listOfCountries) {
	 this.listOfCountries=listOfCountries;
	}
	@XmlElement(name = "country", type=Country.class)
	public List getListOfCountries() {
	 return listOfCountries;
	}
	 
	public void setListOfCountries(List listOfCountries) {
	 this.listOfCountries = listOfCountries;
	}
}