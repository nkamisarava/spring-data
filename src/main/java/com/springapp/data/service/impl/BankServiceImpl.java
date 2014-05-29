package com.springapp.data.service.impl;

import com.springapp.data.entity.Bank;
import com.springapp.data.repository.BankRepository;
import com.springapp.data.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank addBank (Bank bank) {
        Bank saveBank = bankRepository.saveAndFlush(bank);

        return  saveBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }

}
