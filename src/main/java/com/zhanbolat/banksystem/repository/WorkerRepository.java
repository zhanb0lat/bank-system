package com.zhanbolat.banksystem.repository;

import com.zhanbolat.banksystem.entity.Worker;
import com.zhanbolat.banksystem.entity.enums.WorkerStatus;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zhanbolat on 05.01.2017.
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {
    @Query("select w from Worker w where w.status = :status")
    List<Worker> getByStatus(@Param("status") WorkerStatus status);
}
