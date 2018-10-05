package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jd on 2018.10.05..
 *
 * https://dzone.com/articles/spring-data-jpa
 *
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
