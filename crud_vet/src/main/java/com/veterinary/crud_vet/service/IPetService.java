package com.veterinary.crud_vet.service;

import com.veterinary.crud_vet.dto.Owner_PetDTO;
import com.veterinary.crud_vet.model.Pet;

import java.util.List;

public interface IPetService {
    //Create Pet
    void savePet(Pet pet);

    //Read Pet
    Pet findPet(Long petId);

    //Update Pet
    void updatePet(Pet pet);

    //Delete pet
    void deletePet(Long petId);

    //List pets
    List<Pet> listPets();

    //Find Pets with breed "Dog" and kind "Akita"
    List<Pet> sortPets();

    //Combined data from Owner and Pet
    List<Owner_PetDTO> listCombined();
}
