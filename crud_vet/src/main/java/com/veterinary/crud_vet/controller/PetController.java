package com.veterinary.crud_vet.controller;

import com.veterinary.crud_vet.dto.Owner_PetDTO;
import com.veterinary.crud_vet.model.Pet;
import com.veterinary.crud_vet.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {
    @Autowired
    IPetService petServ;

    @PostMapping("/pet/create")
    public String savePet(@RequestBody Pet pet){
        petServ.savePet(pet);
        return "Pet Saved Successfully!!!";
    }

    @GetMapping("/pet/getPet/{petId}")
    public Pet getPet(@PathVariable Long petId){
        return petServ.findPet(petId);
    }

    @GetMapping("/pet/getPets")
    public List<Pet> getPets(){
        return petServ.listPets();
    }

    @PutMapping("/pet/modify")
    public Pet modifyPet(@RequestBody Pet pet){
        petServ.updatePet(pet);
        return petServ.findPet(pet.getPetId());
    }

    @DeleteMapping("/pet/delete/{petId}")
    public String deletePet(@PathVariable Long petId){
        petServ.deletePet(petId);
        return "Pet deleted Successfully";
    }

    @GetMapping("/pet/getSortedPets")
    public List<Pet> getSortedPets(){
        return petServ.sortPets();
    }

    @GetMapping("/pet/getCombined")
    public List<Owner_PetDTO> getCombinedList(){
        return petServ.listCombined();
    }
}
