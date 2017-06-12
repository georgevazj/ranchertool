package com.bbva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jorge on 9/6/17.
 */

@Entity
@Table(name = "uuaa")
public class Uuaa {

    @Id
    @Column(name = "uuaa", unique = true, nullable = false, length = 4)
    private String uuaa;
    @Column(name = "description", length = 255)
    private String description;


    public Uuaa() {
    }

    public Uuaa(String uuaa, String description) {
        this.uuaa = uuaa;
        this.description = description;
    }

    public String getUuaa() {
        return uuaa;
    }

    public void setUuaa(String uuaa) {
        this.uuaa = uuaa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
