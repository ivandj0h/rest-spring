package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String username;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<UserAddress> address = new ArrayList<>();
    private String phone;
    private String website;
    @OneToOne(cascade = CascadeType.ALL)
    private Set<UserCompany> company;
}
