package com.myoffice.office.services;

import com.myoffice.office.models.EarningsLevel;
import com.myoffice.office.repositories.EarningsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EarningsService {

    @Autowired
    private EarningsRepository earningsRepository;


    public EarningsLevel addEarningsLvl(EarningsLevel earningsLevel) {
        return earningsRepository.save(earningsLevel);
    }
}
