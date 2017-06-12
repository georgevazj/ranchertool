package com.bbva.model;

import com.bbva.entity.Image;
import com.bbva.entity.Uuaa;

/**
 * Created by Jorge on 12/6/17.
 */
public class DockerfileModel {

    private String servicename;
    private Image image;
    private Uuaa uuaa;
    private String path;
    private String description;

    public DockerfileModel() {
    }

    public DockerfileModel(String servicename, Image image, Uuaa uuaa, String path, String description) {
        this.servicename = servicename;
        this.image = image;
        this.uuaa = uuaa;
        this.path = path;
        this.description = description;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Uuaa getUuaa() {
        return uuaa;
    }

    public void setUuaa(Uuaa uuaa) {
        this.uuaa = uuaa;
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

    @Override
    public String toString() {
        return "DockerfileModel{" +
                "servicename='" + servicename + '\'' +
                ", image=" + image +
                ", uuaa=" + uuaa +
                ", path='" + path + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
