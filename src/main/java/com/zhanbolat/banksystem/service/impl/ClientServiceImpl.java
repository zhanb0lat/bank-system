package com.zhanbolat.banksystem.service.impl;

import com.zhanbolat.banksystem.entity.Client;
import com.zhanbolat.banksystem.repository.ClientRepository;
import com.zhanbolat.banksystem.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhanbolat on 10.01.2017.
 */
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    public void delete(long id) {
        clientRepository.delete(id);
    }

    public Client getById(long id) {
        return clientRepository.findOne(id);
    }

    public Client getByPhoneNumber(String phoneNumber) {
        return clientRepository.getByPhoneNumber(phoneNumber);
    }

    public Client editClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}