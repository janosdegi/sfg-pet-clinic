package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jd on 2018.10.05..
 *
 * https://dzone.com/articles/spring-data-jpa
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
