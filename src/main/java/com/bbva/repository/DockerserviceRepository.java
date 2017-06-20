package com.bbva.repository;

import com.bbva.entity.Dockerservice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Jorge on 20/6/17.
 */


public interface DockerserviceRepository extends JpaRepository<Dockerservice, Serializable> {

    public abstract Dockerservice findDockerserviceById(int id);

}
