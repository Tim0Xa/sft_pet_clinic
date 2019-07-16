package tim.spring.app.sft_pet_clinic.services.map;

import tim.spring.app.sft_pet_clinic.model.Pet;
import tim.spring.app.sft_pet_clinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Integer> implements CrudService<Pet,Integer> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }
}
