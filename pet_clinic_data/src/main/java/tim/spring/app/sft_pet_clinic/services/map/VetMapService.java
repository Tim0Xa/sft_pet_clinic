package tim.spring.app.sft_pet_clinic.services.map;

import org.springframework.stereotype.Service;
import tim.spring.app.sft_pet_clinic.model.Vet;
import tim.spring.app.sft_pet_clinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Integer> implements VetService {
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
        return super.save(obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public Set<Vet> findByLastName(String lastName) {
        return null;
    }
}
