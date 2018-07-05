package com.myprojects.spring.examples.spring5RestWS.services;

import com.myprojects.spring.examples.api.domain.User;
import com.myprojects.spring.examples.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+ limit, UserData.class);
        return userData.getData();
    }
}
