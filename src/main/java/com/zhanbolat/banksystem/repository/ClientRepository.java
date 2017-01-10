package com.zhanbolat.banksystem.repository;

import com.zhanbolat.banksystem.entity.Client;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("select c from Client c where c.phoneNumber = :phoneNumber")
    Client getByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
