package tim.spring.app.sft_pet_clinic.services;

import tim.spring.app.sft_pet_clinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findBiId(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
