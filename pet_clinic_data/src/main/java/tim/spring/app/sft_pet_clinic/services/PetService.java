package tim.spring.app.sft_pet_clinic.services;

import tim.spring.app.sft_pet_clinic.model.Pet;

public interface PetService extends CrudService<Pet, Long>{

    Pet findBiId(Long id);

}
