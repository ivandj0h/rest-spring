package online.ivandjoh.collection.service.impl;

import online.ivandjoh.collection.Http.HttpResponse.UserResponse;
import online.ivandjoh.collection.service.AppService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers(String baseUri) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<UserResponse>> response = restTemplate.exchange(
                baseUri + "/users",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserResponse>>(){});
        List<UserResponse> employees = response.getBody();
        return response;
    }

    @Override
    public UserResponse getUser(String baseUri, int id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(
                baseUri + "/users/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<UserResponse>(){});
        UserResponse employee = response.getBody();
        return employee;
    }

    @Override
    public UserResponse createUser(String baseUri, UserResponse user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<UserResponse> response = restTemplate.exchange(
                baseUri + "/users",
                HttpMethod.POST,
                new org.springframework.http.HttpEntity<>(user, headers),
                new ParameterizedTypeReference<UserResponse>(){});
        UserResponse employee = response.getBody();
        return employee;
    }
}

