package tim.spring.app.sft_pet_clinic.services.map;

import tim.spring.app.sft_pet_clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Integer> {

    protected Map<Integer, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(T obj){
        if (obj != null){
            if (obj.getId() == null){
                obj.setId(this.getNextId());
            }
            map.put(obj.getId(),obj);
        } else {
            throw new RuntimeException("The Object is Null");
        }
        return map.get(obj.getId());
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    private Integer getNextId(){
        Integer nextId;
        try {
            nextId = Collections.max(map.keySet()) +1 ;
        } catch (NoSuchElementException e){
            nextId = 1;
        }
        return nextId;
    }
}
