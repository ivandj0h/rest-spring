package online.ivandjoh.collection.Controller;

import lombok.extern.slf4j.Slf4j;
import online.ivandjoh.collection.Http.HttpResponse.UserResponse;
import online.ivandjoh.collection.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1/")
public class AppController {

    @Autowired
    private AppService appService;

    @Value("${jsonplaceholder.base-uri}")
    private String baseUri;


    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUsers() {
        log.info("Get all users {}, {}", appService.getAllUsers(baseUri), appService.getAllUsers(baseUri).getBody());
        return appService.getAllUsers(baseUri);
    }

    @GetMapping("/user/{id}")
    public UserResponse getUser(@PathVariable int id) {
        log.info("Get user {}", appService.getUser(baseUri, id));
        return appService.getUser(baseUri, id);
    }

    @PostMapping("/user")
    public UserResponse createUser(@RequestBody UserResponse user) {
        log.info("Create user {}", appService.createUser(baseUri, user));
        return appService.createUser(baseUri, user);
    }
}
