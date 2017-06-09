package com.bbva.service;

import com.bbva.entity.Uuaa;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jorge on 9/6/17.
 */

@Service
public interface UuaaService {

    public abstract Uuaa addUuaa(Uuaa uuaa);
    public abstract List<Uuaa> listAllUuaa();
    public abstract Uuaa findUuaaByName(String uuaa);
    public abstract void removeUuaa(String uuaa);

}
