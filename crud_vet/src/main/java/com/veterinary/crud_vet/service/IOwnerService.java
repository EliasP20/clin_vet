package com.veterinary.crud_vet.service;

import com.veterinary.crud_vet.model.Owner;

import java.util.List;

public interface IOwnerService{
    //Create Owner
    void saveOwner(Owner owner);

    //Read Owner
    Owner findOwner(Long ownerId);

    //Update Owner
    void updateOwner(Owner owner);

    //Delete owner
    void deleteOwner(Long ownerId);

    //List owners
    List<Owner> listOwners();
}
