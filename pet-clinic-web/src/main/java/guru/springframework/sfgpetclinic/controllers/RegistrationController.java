package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.dto.RegistrationDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(description = "This is my registration controller")
@RestController
public class RegistrationController {

    @ApiOperation(value = "This is a registration service", notes = "These are some notes about API.")
    @RequestMapping(value = "/registration", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<RegistrationDTO> registerUser(RegistrationDTO registrationDTO) {
        RegistrationDTO regDTO = new RegistrationDTO("test@test.com", "123456", "01.01.2019");
        List<RegistrationDTO> regDTOs = new ArrayList<>();
        regDTOs.add(regDTO);
        regDTOs.add(new RegistrationDTO("aaa@test.com", "34534", "01.06.2014"));
        regDTOs.add(new RegistrationDTO("ddd@test.com", "66666", "21.04.2017"));
        return regDTOs;
    }


}
