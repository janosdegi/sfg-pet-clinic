package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jd on 2018.09.17..
 */
@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality Speciality) {
        return super.save(Speciality);
    }

    @Override
    public void delete(Speciality Speciality) {
        super.delete(Speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
