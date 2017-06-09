package com.bbva.entity;

import javax.persistence.*;

/**
 * Created by Jorge on 7/6/17.
 */

@Entity
@Table(name = "dockerfiles", uniqueConstraints = @UniqueConstraint(columnNames = {"servicename", "id_image", "uuaa"}))
public class Dockerfile {

    @Id
    @GeneratedValue
    @Column(name = "id_dockerfile", unique = true, nullable = false)
    private int id;
    @Column(name = "servicename", unique = true, nullable = false, length = 45)
    private String servicename;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "uuaa", nullable = false)
    private Uuaa uuaa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_image", nullable = false)
    private Image image;

    @Column(name = "path")
    private String path;
    @Column(name = "description")
    private String description;

    public Dockerfile() {
    }

    public Dockerfile(String servicename, Uuaa uuaa, Image image, String path, String description) {
        this.servicename = servicename;
        this.uuaa = uuaa;
        this.image = image;
        this.path = path;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Uuaa getUuaa() {
        return uuaa;
    }

    public void setUuaa(Uuaa uuaa) {
        this.uuaa = uuaa;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
