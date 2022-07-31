package online.ivandjoh.collection.service;

import online.ivandjoh.collection.Http.HttpResponse.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AppService {
    ResponseEntity<List<UserResponse>> getAllUsers(String baseUri);

    UserResponse getUser(String baseUri, int id);

    UserResponse createUser(String baseUri, UserResponse user);
}
