package com.mustafazorbaz.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mustafazorbaz.domain.Country;
import com.mustafazorbaz.domain.CountryList;
/**
 * 
 * @author Mustafa
 *
 */
@RestController
public class CountryController {
 
 @RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/xml")
 public CountryList getCountries()
 {
  CountryList countryList=createCountryList();
  return countryList;
 }
 
 @RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
 public Country getCountryById(@PathVariable int id)
 {
  List listOfCountries = new ArrayList();
  CountryList countryList=createCountryList();
  listOfCountries=countryList.getListOfCountries();

  for (int i = 0; i < listOfCountries.size(); i++) {
	  Country country = (Country) listOfCountries.get(i);
	  if(country.getId()==id)
		    return country;
	  
  }
   
   
  
  return null;
 }
 
/// Utiliy method to create country list.
 public CountryList createCountryList()
 {
	  Country indiaCountry=new Country(1, "India");
	  Country chinaCountry=new Country(4, "China");
	  Country nepalCountry=new Country(3, "Nepal");
	  Country bhutanCountry=new Country(2, "Bhutan");
	 
	  List listOfCountries = new ArrayList();
	  listOfCountries.add(indiaCountry);
	  listOfCountries.add(chinaCountry);
	  listOfCountries.add(nepalCountry);
	  listOfCountries.add(bhutanCountry);
	  return new CountryList(listOfCountries);
 }
}
 