package online.ivandjoh.collection.Http.HttpResponse;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserResponse implements Serializable {
	private int id;
	private String name;
	private String username;
	private String email;
	private UserAddress address;
	private String phone;
	private String website;
	private UserCompany company;
}