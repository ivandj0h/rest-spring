package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "geo_table")
public class Geo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lat;
    private String lng;
    @OneToOne(mappedBy = "geo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Address address;

}
