package com.progcreek.authentication.inmemoryauth.service;

import com.progcreek.authentication.inmemoryauth.domain.Credential;
import com.progcreek.authentication.inmemoryauth.dto.CredentialDto;
import com.progcreek.authentication.inmemoryauth.repo.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public boolean authenticate(CredentialDto credentialDto) {
        List<Credential> credentials = authRepository.findAll();
        for (Credential credential : credentials) {
            if(credential.getUsername().equals(credentialDto.getUsername())
                && credential.getPassword().equals(credentialDto.getPassword()))
                return true;
        }
        return false;
    }
}
