package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by jd on 2018.10.03..
 */
@RunWith(SpringRunner.class)
public class OwnerServiceMapTest {

    OwnerMapService ownerMapService;

    @Before
    public void setUp() {
        ownerMapService = new OwnerMapService();
        ownerMapService.save(new Owner());
    }

    @Test
    public void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        System.out.println("------------------------------------");
        System.out.println("ownerSet.size(): " + ownerSet.size());
        System.out.println("------------------------------------");

        assertEquals(1, ownerSet.size());
    }

//    @Test
//    void findById() {
//
//    }
//
//    @Test
//    void save() {
//
//    }
//
//    @Test
//    void delete() {
//
//    }
//
//    @Test
//    void deleteById() {
//
//    }
//
//    @Test
//    void findByLastName() {
//
//    }

}