package com.bbva.entity;

import javax.persistence.*;

/**
 * Created by Jorge on 19/6/17.
 */

@Entity
@Table(name = "services")
public class Service {

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

}
