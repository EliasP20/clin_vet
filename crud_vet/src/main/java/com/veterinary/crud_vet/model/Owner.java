package com.veterinary.crud_vet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ownerId;
    private String ownerIdentification;
    private String name;
    private String lastName;
    private String phoneNumber;

    public Owner(){

    }

    public Owner(Long ownerId, String ownerIdentification, String name, String lastName, String phoneNumber) {
        this.ownerId = ownerId;
        this.ownerIdentification = ownerIdentification;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
