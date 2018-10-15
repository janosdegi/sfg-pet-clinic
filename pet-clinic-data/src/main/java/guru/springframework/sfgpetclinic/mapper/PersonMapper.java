package guru.springframework.sfgpetclinic.mapper;

import guru.springframework.sfgpetclinic.dto.RegistrationDTO;
import guru.springframework.sfgpetclinic.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by jd on 2018.10.15..
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "firstName", target = "email")
    @Mapping(source = "lastName", target = "password")
    RegistrationDTO personToregistrationDTO(Person person);

}
