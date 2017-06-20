package com.bbva.model;

import com.bbva.entity.Image;

/**
 * Created by Jorge on 20/6/17.
 */
public class ServiceModel {

    private String servicename;
    private String entrypoint;
    private Image image;
    private boolean stdin_open;
    private boolean tty;
    private String workingdir;


    public ServiceModel() {
    }

    public ServiceModel(String servicename, String entrypoint, Image image, boolean stdin_open, boolean tty, String workingdir) {
        this.servicename = servicename;
        this.entrypoint = entrypoint;
        this.image = image;
        this.stdin_open = stdin_open;
        this.tty = tty;
        this.workingdir = workingdir;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isStdin_open() {
        return stdin_open;
    }

    public void setStdin_open(boolean stdin_open) {
        this.stdin_open = stdin_open;
    }

    public boolean isTty() {
        return tty;
    }

    public void setTty(boolean tty) {
        this.tty = tty;
    }

    public String getWorkingdir() {
        return workingdir;
    }

    public void setWorkingdir(String workingdir) {
        this.workingdir = workingdir;
    }

    @Override
    public String toString() {
        return "ServiceModel{" +
                "servicename='" + servicename + '\'' +
                ", entrypoint='" + entrypoint + '\'' +
                ", image=" + image +
                ", stdin_open=" + stdin_open +
                ", tty=" + tty +
                ", workingdir='" + workingdir + '\'' +
                '}';
    }
}
