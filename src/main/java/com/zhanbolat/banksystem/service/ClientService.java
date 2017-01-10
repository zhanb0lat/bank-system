package com.zhanbolat.banksystem.service;

import com.zhanbolat.banksystem.entity.Client;

import java.util.List;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface ClientService {
    Client addClient(Client client);
    void delete(long id);
    Client getById(long id);
    Client getByPhoneNumber(String phoneNumber);
    Client editClient(Client client);
    List<Client> getAll();
}
