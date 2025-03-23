package com.veterinary.crud_vet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long petId;
    private String name;
    private String breed;
    private String kind;
    private String color;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ownerId", referencedColumnName = "ownerId")
    private Owner owner;

    public Pet(){

    }

    public Pet(Long petId, String name, String breed, String kind, String color) {
        this.petId = petId;
        this.name = name;
        this.breed = breed;
        this.kind = kind;
        this.color = color;
    }
}
