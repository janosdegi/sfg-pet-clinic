package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Dégi János on 2018.09.17..
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
