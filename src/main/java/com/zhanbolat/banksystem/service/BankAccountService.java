package com.zhanbolat.banksystem.service;

import com.zhanbolat.banksystem.entity.BankAccount;

import java.util.List;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface BankAccountService {
    BankAccount addBankAccount(BankAccount bankAccount);
    void delete(long id);
    BankAccount getById(long id);
    BankAccount editBankAccount(BankAccount bankAccount);
    List<BankAccount> getAll();
}
