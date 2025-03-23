package com.veterinary.crud_vet.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Owner_PetDTO {
    private String petName;
    private String breed;
    private String kind;
    private String ownerName;
    private String ownerLastName;

    public Owner_PetDTO(){

    }

    public Owner_PetDTO(String petName, String breed, String kind, String ownerName, String ownerLastName) {
        this.petName = petName;
        this.breed = breed;
        this.kind = kind;
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
    }
}
