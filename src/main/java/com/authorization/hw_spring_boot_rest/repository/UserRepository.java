package com.authorization.hw_spring_boot_rest.repository;

import com.authorization.hw_spring_boot_rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        HashMap<String, String> authorizationPeoples = new HashMap<>() {{
            put("admin1", "1234");
            put("admin2", "2345");
            put("admin3", "3456");
        }};

        return authorizationPeoples.containsKey(user) && authorizationPeoples.get(user).equals(password)? List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE) : new ArrayList<>();
    }
}
