package online.ivandjoh.collection.Http.HttpResponse;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class UserAddress {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private UserGeo geo;
}