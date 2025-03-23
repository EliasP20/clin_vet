package com.veterinary.crud_vet.controller;

import com.veterinary.crud_vet.model.Owner;
import com.veterinary.crud_vet.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {
    @Autowired
    IOwnerService ownServ;

    @PostMapping("/owner/create")
    public String saveOwner(@RequestBody Owner owner){
        ownServ.saveOwner(owner);
        return "Owner Saved Successfully!!!";
    }

    @GetMapping("/owner/getOwners")
    public List<Owner> getOwners(){
        return ownServ.listOwners();
    }

    @GetMapping("/owner/getOwner/{ownerId}")
    public Owner getOwner(@PathVariable Long ownerId){
        return ownServ.findOwner(ownerId);
    }

    @PutMapping("/owner/modify")
    public Owner modifyOwner(@RequestBody Owner owner){
        ownServ.updateOwner(owner);
        return ownServ.findOwner(owner.getOwnerId());
    }

    @DeleteMapping("/owner/delete/{ownerId}")
    public String deleteOwner(@PathVariable Long ownerId){
        ownServ.deleteOwner(ownerId);
        return "Owner deleted Successfully";
    }
}
