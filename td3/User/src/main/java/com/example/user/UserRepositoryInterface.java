package com.example.user;

import java.util.ArrayList;

public interface UserRepositoryInterface {

    public User getUser(String id);

    ArrayList<User> getAllUSers();
}
