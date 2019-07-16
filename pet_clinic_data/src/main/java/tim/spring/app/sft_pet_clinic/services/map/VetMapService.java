package tim.spring.app.sft_pet_clinic.services.map;

import tim.spring.app.sft_pet_clinic.model.Vet;
import tim.spring.app.sft_pet_clinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Integer> implements CrudService<Vet,Integer> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }
}
