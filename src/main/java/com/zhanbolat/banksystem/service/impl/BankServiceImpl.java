package com.zhanbolat.banksystem.service.impl;

import com.zhanbolat.banksystem.entity.Bank;
import com.zhanbolat.banksystem.repository.BankRepository;
import com.zhanbolat.banksystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    public Bank addBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    public void delete(long id) {
        bankRepository.delete(id);
    }

    public Bank getById(long id) {
        return bankRepository.findOne(id);
    }

    public Bank getByName(String name) {
        return bankRepository.getByName(name);
    }

    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
