package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Dégi János on 2018.09.14..
 */
public class BaseEntity implements Serializable {

    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
