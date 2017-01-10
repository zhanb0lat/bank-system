package com.zhanbolat.banksystem.service;

import com.zhanbolat.banksystem.entity.Worker;
import com.zhanbolat.banksystem.entity.enums.WorkerStatus;

import java.util.List;

/**
 * Created by zhanbolat on 10.01.2017.
 */
public interface WorkerService {
    Worker addWorker(Worker worker);
    void delete(long id);
    Worker getById(long id);
    List<Worker> getByStatus(WorkerStatus status);
    Worker editWorker(Worker worker);
    List<Worker> getAll();
}
