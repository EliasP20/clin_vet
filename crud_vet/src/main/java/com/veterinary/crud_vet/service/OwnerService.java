package com.veterinary.crud_vet.service;

import com.veterinary.crud_vet.model.Owner;
import com.veterinary.crud_vet.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService{
    @Autowired
    IOwnerRepository ownRep;

    @Override
    public void saveOwner(Owner owner) {
        ownRep.save(owner);
    }

    @Override
    public Owner findOwner(Long ownerId) {
        return ownRep.findById(ownerId).orElse(null);
    }

    @Override
    public void updateOwner(Owner owner) {
        saveOwner(owner);
    }

    @Override
    public void deleteOwner(Long ownerId) {
        ownRep.deleteById(ownerId);
    }

    @Override
    public List<Owner> listOwners() {
        return ownRep.findAll();
    }
}
