package com.eldaram.realestate.service;

import com.eldaram.realestate.model.Client;
import com.eldaram.realestate.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client save(Client client) {
        return repository.save(client);
    }
}
