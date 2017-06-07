package com.bbva.repository;

import com.bbva.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by Jorge on 7/6/17.
 */
public interface UserRepository extends JpaRepository<User, Serializable> {

    public abstract User findByUsername(String username);

}
