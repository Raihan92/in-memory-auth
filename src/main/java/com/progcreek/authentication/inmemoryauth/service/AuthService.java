package com.progcreek.authentication.inmemoryauth.service;

import com.progcreek.authentication.inmemoryauth.dto.CredentialDto;

public interface AuthService {
    boolean authenticate(CredentialDto credentialDto);
}
