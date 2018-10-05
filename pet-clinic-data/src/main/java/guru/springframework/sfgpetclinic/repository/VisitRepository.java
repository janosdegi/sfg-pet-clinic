package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jd on 2018.10.05..
 *
 * https://dzone.com/articles/spring-data-jpa
 *
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
