package guru.springframework.sfgpetclinic.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by jd on 2018.10.11..
 */
public class RegistrationControllerTest {

    @InjectMocks
    RegistrationController controller;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    //https://memorynotfound.com/unit-test-spring-mvc-rest-service-junit-mockito/

    @Test
    public void registerUser() throws Exception {
        mockMvc.perform(get("/registration"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$[0].email", is("test@test.com")))
                .andExpect(jsonPath("$[1].password", is("34534")))
                .andExpect(jsonPath("$[2].registrationDate", is("21.04.2017")));

//                .andExpect(model().attribute("owners", hasSize(3)));
    }

}