package com.bbva.repository;

import com.bbva.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Jorge on 9/6/17.
 */
public interface ImageRepository extends JpaRepository<Image, Serializable> {

    public abstract Image findImageByName(String name);

}
