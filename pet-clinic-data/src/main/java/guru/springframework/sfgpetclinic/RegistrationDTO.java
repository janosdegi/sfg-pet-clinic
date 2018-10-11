package guru.springframework.sfgpetclinic;

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

    private String email;
    private String password;
    private String registrationDate;

}
