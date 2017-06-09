package com.bbva.entity;

import javax.persistence.*;

/**
 * Created by Jorge on 7/6/17.
 */

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    @Column(name = "id_image", unique = true, nullable = false)
    private int id;
    @Column(name = "image", nullable = false, length = 250)
    private String name;
    @Column(name ="version", nullable = false, length = 10)
    private String version;
    @Column(name = "description", nullable = true, length = 250)
    private String description;

    public Image() {
    }

    public Image(String name, String version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
