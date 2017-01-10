package com.zhanbolat.banksystem.repository;

import com.zhanbolat.banksystem.entity.Bank;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query("select b from Bank b where b.name = :name")
    Bank getByName(@Param("name") String name);
}
