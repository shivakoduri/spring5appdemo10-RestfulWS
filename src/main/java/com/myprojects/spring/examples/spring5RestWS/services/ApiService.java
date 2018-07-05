package com.myprojects.spring.examples.spring5RestWS.services;

import com.myprojects.spring.examples.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
