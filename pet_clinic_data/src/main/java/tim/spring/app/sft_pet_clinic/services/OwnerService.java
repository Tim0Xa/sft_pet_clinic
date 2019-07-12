package tim.spring.app.sft_pet_clinic.services;

import tim.spring.app.sft_pet_clinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findBiId(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Set<Owner> findByLastName(String lastName);
}
