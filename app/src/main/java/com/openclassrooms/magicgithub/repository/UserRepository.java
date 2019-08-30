package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        List<User> userList = new ArrayList <User>();
        userList.addAll(FAKE_USERS);
        return userList;
    }

    public void generateRandomUser() {
        // TODO: A modifier
    }

    public void deleteUser(User user) {
        // TODO: A modifier
    }
}
