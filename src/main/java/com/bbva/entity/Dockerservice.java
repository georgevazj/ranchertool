package com.bbva.entity;

import javax.persistence.*;

/**
 * Created by Jorge on 19/6/17.
 */

@Entity
@Table(name = "services")
public class Dockerservice {

    @Id
    @GeneratedValue
    @Column(name = "id_service", unique = true, nullable = false)
    private int id;

    @Column(name = "servicename", length = 100, nullable = false)
    private String servicename;

    @Column(name = "entrypoint", length = 255)
    private String entrypoint;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_image", nullable = false)
    private Image image;

    @Column(name = "stdin")
    private boolean stdin_open;

    @Column(name = "tty")
    private boolean tty;

    @Column(name = "workingdir")
    private String workingdir;


    public Dockerservice() {
    }

    public Dockerservice(String servicename, String entrypoint, Image image, boolean stdin_open, boolean tty, String workingdir) {
        this.servicename = servicename;
        this.entrypoint = entrypoint;
        this.image = image;
        this.stdin_open = stdin_open;
        this.tty = tty;
        this.workingdir = workingdir;
    }

    public int getId() {
        return id;
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
        return "Dockerservice{" +
                "id=" + id +
                ", servicename='" + servicename + '\'' +
                ", entrypoint='" + entrypoint + '\'' +
                ", image=" + image +
                ", stdin_open=" + stdin_open +
                ", tty=" + tty +
                ", workingdir='" + workingdir + '\'' +
                '}';
    }
}
