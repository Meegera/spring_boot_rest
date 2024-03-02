package com.authorization.hw_spring_boot_rest.controller;

import com.authorization.hw_spring_boot_rest.model.Authorities;
import com.authorization.hw_spring_boot_rest.model.User;
import com.authorization.hw_spring_boot_rest.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

//    @GetMapping("/authorize")
//    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
//        return service.getAuthorities(user, password);
//    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user.getUser(), user.getPassword());
    }
}
