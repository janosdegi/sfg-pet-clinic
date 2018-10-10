package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repository.OwnerRepository;
import guru.springframework.sfgpetclinic.repository.PetRepository;
import guru.springframework.sfgpetclinic.repository.PetTypeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by jd on 2018.10.09..
 */
public class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

//    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        System.out.println("setUp");
        service = new OwnerSDJpaService(ownerRepository, petRepository ,petTypeRepository);
        returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    public void findByLastName() throws Exception {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        System.out.println("findByLastName");
        Owner smith = service.findByLastName(LAST_NAME);
//        System.out.println(smith.getLastName());

        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    public void findAll() throws Exception {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    public void findById() throws Exception {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(1L);

        assertNotNull(owner);
    }

    @Test
    public void findByIdNotFound() throws Exception {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(1L);

        assertNull(owner);
    }

    @Test
    public void save() throws Exception {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner = service.save(ownerToSave);

        assertEquals(LAST_NAME, savedOwner.getLastName());
        assertNotNull(savedOwner);

    }

    @Test
    public void delete() throws Exception {
        service.delete(returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    public void deleteById() throws Exception {
        service.deleteById(1L);
        verify(ownerRepository).deleteById(anyLong());
    }

}