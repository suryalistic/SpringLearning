package edu.rest.jersey.InterviewREST.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.rest.jersey.InterviewREST.beans.Country;
import edu.rest.jersey.InterviewREST.dao.CountryDao;

@Path("/countries")
public class CountryService {
	CountryDao cntryDao = new CountryDao();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getAllCountries(){
		return cntryDao.getAllCountries();
	}
	
	@GET
	@Path("{id: d+}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id")String id){
		System.out.println("Id>>>"+id);
		return cntryDao.getCountryById(id);
	}
}
