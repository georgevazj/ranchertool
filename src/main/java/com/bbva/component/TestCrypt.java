package com.bbva.component;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Jorge on 13/6/17.
 */
public class TestCrypt {

    public static void main(String[] args){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("user"));
    }

}
