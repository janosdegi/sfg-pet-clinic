package guru.springframework.sfgpetclinic.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jd on 2018.10.11..
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {

    @ApiModelProperty(value = "This is the email", required = true)
    private String email;
    private String password;

    @ApiModelProperty(value = "This is the date of registration", required = false)
    private String registrationDate;

}
