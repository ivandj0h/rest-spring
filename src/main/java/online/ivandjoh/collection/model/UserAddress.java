package online.ivandjoh.collection.model;

import lombok.Data;
import online.ivandjoh.collection.Http.HttpResponse.UserGeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserGeo geo;

}
