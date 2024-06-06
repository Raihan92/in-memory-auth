package com.progcreek.authentication.inmemoryauth.controller;

import com.progcreek.authentication.inmemoryauth.dto.CredentialDto;
import com.progcreek.authentication.inmemoryauth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody CredentialDto credentialDto) {
        boolean success = authService.authenticate(credentialDto);
        if(success)
            return new ResponseEntity("Success!", HttpStatus.OK);
        else
            return new ResponseEntity("Failed", HttpStatus.NOT_FOUND);
    }

}
