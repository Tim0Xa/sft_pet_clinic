package tim.spring.app.sft_pet_clinic.services;

import tim.spring.app.sft_pet_clinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBiId(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
    Set<Vet> findByLastName(String lastName);
}
