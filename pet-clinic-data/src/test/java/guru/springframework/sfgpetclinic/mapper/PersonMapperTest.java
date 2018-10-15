package guru.springframework.sfgpetclinic.mapper;

import guru.springframework.sfgpetclinic.dto.RegistrationDTO;
import guru.springframework.sfgpetclinic.model.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jd on 2018.10.15..
 */
public class PersonMapperTest {

    public static final String FIRST_NAME = "John";
    public static final String LAST_NAME = "Test";

    @Test
    public void personToregistrationDTO() throws Exception {

        Person person = new Person(FIRST_NAME, LAST_NAME);

        RegistrationDTO registrationDTO = PersonMapper.INSTANCE.personToregistrationDTO(person);

        assertEquals(registrationDTO.getEmail(), FIRST_NAME);
        assertEquals(registrationDTO.getEmail(), person.getFirstName());
        assertEquals(registrationDTO.getPassword(), LAST_NAME);
        assertEquals(registrationDTO.getPassword(), person.getLastName());
    }

}