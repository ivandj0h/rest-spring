package online.ivandjoh.collection.model;

import lombok.Data;
import online.ivandjoh.collection.Http.HttpResponse.UserGeo;

@Data
public class UserAddress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserGeo geo;
}
