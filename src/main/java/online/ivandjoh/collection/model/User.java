package online.ivandjoh.collection.model;

import lombok.Data;
import online.ivandjoh.collection.model.UserAddress;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private int id;
    private String name;
    private String username;
    private String email;
    private UserAddress address;
    private String phone;
    private String website;
    private UserCompany company;
}
