package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String suite;
    private String city;
    private String zipcode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geo_id")
    Geo geo;

}
