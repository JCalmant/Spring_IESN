package com.spring.henallux.securityProject.controller;

import com.spring.henallux.securityProject.dataAccess.entity.UserEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticatedController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Authentication authentication) {
        UserEntity userDetails = (UserEntity) authentication.getPrincipal();

        return userDetails.getUsername();
    }
}
