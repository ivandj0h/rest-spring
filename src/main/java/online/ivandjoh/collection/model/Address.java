package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "address_table")
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String suite;
    private String city;
    private String zipcode;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geo_id", referencedColumnName = "id")
    Geo geo;

}
