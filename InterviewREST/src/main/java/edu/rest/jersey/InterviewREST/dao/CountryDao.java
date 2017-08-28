package edu.rest.jersey.InterviewREST.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import edu.rest.jersey.InterviewREST.beans.Country;

public class CountryDao {
	Map<String,Country> countryMap = new HashMap<>();
	public CountryDao(){
		countryMap.put("0001", new Country("0001", "India1"));
		countryMap.put("0002", new Country("0002", "India2"));
		countryMap.put("0003", new Country("0003", "India3"));
		countryMap.put("0004", new Country("0004", "India4"));
		countryMap.put("0005", new Country("0005", "India5"));
	}
	
	public List<Country> getAllCountries(){
		List<Country> cntryList = new ArrayList<>();
		cntryList.addAll(countryMap.values());
		return cntryList;
	}
	
	public Country getCountryById(final String id){
		return (Country)((List<Country>)countryMap.values()).
				stream().
				filter(cntry -> id.equalsIgnoreCase(cntry.getId())).
				collect(Collectors.toList()).get(0);
	}
}
