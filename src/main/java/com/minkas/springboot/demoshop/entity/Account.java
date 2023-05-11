package com.minkas.springboot.demoshop.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class UserAccount {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private boolean active;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn("image_id")
    private Image avatar;


}
