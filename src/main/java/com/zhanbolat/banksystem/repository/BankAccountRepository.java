package com.zhanbolat.banksystem.repository;

import com.zhanbolat.banksystem.entity.BankAccount;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
