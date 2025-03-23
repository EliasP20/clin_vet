package com.veterinary.crud_vet.service;

import com.veterinary.crud_vet.dto.Owner_PetDTO;
import com.veterinary.crud_vet.model.Pet;
import com.veterinary.crud_vet.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService implements IPetService{
    @Autowired
    IPetRepository petRepo;

    @Override
    public void savePet(Pet pet) {
        petRepo.save(pet);
    }

    @Override
    public Pet findPet(Long petId) {
        return petRepo.findById(petId).orElse(null);
    }

    @Override
    public void updatePet(Pet pet) {
        savePet(pet);
    }

    @Override
    public void deletePet(Long petId) {
        petRepo.deleteById(petId);
    }

    @Override
    public List<Pet> listPets() {
        return petRepo.findAll();
    }

    @Override
    public List<Pet> sortPets() {
        List<Pet> sortedPets = petRepo.findAll();
        sortedPets.removeIf(p -> !(p.getBreed().equalsIgnoreCase("Dog"))
                            && p.getKind().equalsIgnoreCase("Akita"));

        return sortedPets;
    }

    @Override
    public List<Owner_PetDTO> listCombined() {
        List<Owner_PetDTO> list = new ArrayList<>();

        for(Pet p: petRepo.findAll()){
            list.add(new Owner_PetDTO(p.getName(), p.getBreed(), p.getKind(), p.getOwner().getName(), p.getOwner().getLastName()));
        }

        return list;
    }
}
