package com.zhanbolat.banksystem.service.impl;

import com.zhanbolat.banksystem.entity.Worker;
import com.zhanbolat.banksystem.entity.enums.WorkerStatus;
import com.zhanbolat.banksystem.repository.WorkerRepository;
import com.zhanbolat.banksystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhanbolat on 10.01.2017.
 */
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    WorkerRepository workerRepository;

    public Worker addWorker(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    public void delete(long id) {
        workerRepository.delete(id);
    }

    public List<Worker> getByStatus(WorkerStatus status) {
        return workerRepository.getByStatus(status);
    }

    public Worker getById(long id) {
        return workerRepository.findOne(id);
    }

    public Worker editWorker(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    public List<Worker> getAll() {
        return workerRepository.findAll();
    }
}
