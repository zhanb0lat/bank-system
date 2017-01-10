package com.zhanbolat.banksystem.service;

import com.zhanbolat.banksystem.entity.Bank;

import java.util.List;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getById(long id);
    Bank getByName(String name);
    Bank editBank(Bank bank);
    List<Bank> getAll();
}
