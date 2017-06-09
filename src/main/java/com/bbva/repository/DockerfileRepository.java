package com.bbva.repository;

import com.bbva.entity.Dockerfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Jorge on 9/6/17.
 */
public interface DockerfileRepository extends JpaRepository<Dockerfile, Serializable> {

    public abstract Dockerfile findDockerfileById(int id);

}
