package com.example.server;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class UserService {
    private Map<String, String> userMap = new HashMap<>();

    public UserService() {
        userMap.put("1", "Alice");
        userMap.put("2", "Bob");
    }

    public List<String> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public String getUser(String id) {
        return userMap.get(id);
    }
}
