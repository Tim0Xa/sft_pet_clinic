package tim.spring.app.sft_pet_clinic.services;

import tim.spring.app.sft_pet_clinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Set<Vet> findByLastName(String lastName);
}
