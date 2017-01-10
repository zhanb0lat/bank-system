package com.zhanbolat.banksystem.service.impl;

import com.zhanbolat.banksystem.entity.BankAccount;
import com.zhanbolat.banksystem.repository.BankAccountRepository;
import com.zhanbolat.banksystem.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhanbolat on 10.01.2017.
 */
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    BankAccountRepository bankAccountRepository;

    public BankAccount addBankAccount(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    public void delete(long id) {
        bankAccountRepository.delete(id);
    }

    public BankAccount getById(long id) {
        return bankAccountRepository.findOne(id);
    }

    public BankAccount editBankAccount(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    public List<BankAccount> getAll() {
        return bankAccountRepository.findAll();
    }
}
