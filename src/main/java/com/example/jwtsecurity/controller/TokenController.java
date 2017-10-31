package com.example.jwtsecurity.controller;

import com.example.jwtsecurity.model.JwtUser;
import com.example.jwtsecurity.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private  JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){

        return jwtGenerator.generate(jwtUser);
    }
}
