package com.bbva.service.impl;

import com.bbva.entity.Uuaa;
import com.bbva.repository.UuaaRepository;
import com.bbva.service.UuaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jorge on 9/6/17.
 */

@Service
public class UuaaServiceImpl implements UuaaService {

    @Autowired
    private UuaaRepository uuaaRepository;

    @Override
    public Uuaa addUuaa(Uuaa uuaa) {
        return uuaaRepository.save(uuaa);
    }

    @Override
    public List<Uuaa> listAllUuaa() {
        return uuaaRepository.findAll();
    }

    @Override
    public Uuaa findUuaaByName(String uuaa) {
        return uuaaRepository.findOne(uuaa);
    }

    @Override
    public void removeUuaa(String uuaa) {
        uuaaRepository.delete(findUuaaByName(uuaa));
    }
}
