package guru.springframework.sfgpetclinic.model;

/**
 * Created by Dégi János on 2018.09.11..
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
