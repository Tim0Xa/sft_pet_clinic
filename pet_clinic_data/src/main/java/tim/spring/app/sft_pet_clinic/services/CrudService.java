package tim.spring.app.sft_pet_clinic.services;

import java.util.Set;

public interface CrudService <T, ID> {

    Set<T> findAll();
     T findById(ID id);
     T save(T obj);
     void delet(T obj);
     void deletById(ID id);
}
