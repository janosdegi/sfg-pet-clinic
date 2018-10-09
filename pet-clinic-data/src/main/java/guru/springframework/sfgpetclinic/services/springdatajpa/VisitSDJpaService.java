package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repository.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jd on 2018.10.08..
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository VisitRepository;

    public VisitSDJpaService(VisitRepository VisitRepository) {
//        Why field injection is evil
//        http://olivergierke.de/2013/11/why-field-injection-is-evil/
//        https://stackoverflow.com/questions/40620000/spring-autowire-on-properties-vs-constructor
        this.VisitRepository = VisitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> Visits = new HashSet<>();
        VisitRepository.findAll().forEach(Visits::add);
        return Visits;
    }

    @Override
    public Visit findById(Long id) {
        return VisitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return VisitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        VisitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        VisitRepository.deleteById(id);
    }
}
