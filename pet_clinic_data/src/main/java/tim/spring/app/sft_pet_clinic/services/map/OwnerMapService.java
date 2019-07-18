package tim.spring.app.sft_pet_clinic.services.map;

import tim.spring.app.sft_pet_clinic.model.Owner;
import tim.spring.app.sft_pet_clinic.services.OwnerService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Integer> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return null;
    }
}
