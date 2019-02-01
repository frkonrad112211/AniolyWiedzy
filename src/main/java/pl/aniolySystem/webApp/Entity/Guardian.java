package pl.aniolySystem.webApp.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.aniolySystem.webApp.DTO.GuardianDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String lastName;
    String street;
    String city;
    String mobile;
    String email;
    String addNote;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "care",
            joinColumns = { @JoinColumn(name = "guardian_id") },
            inverseJoinColumns = { @JoinColumn(name = "child_id") }
    )
    Set<Child> childList;

    public void guardianDTOtoguardian(GuardianDTO guardianDTO){
        this.name = guardianDTO.getName();
        this.lastName = guardianDTO.getLastName();
        this.mobile = guardianDTO.getMobile();
        this.city = guardianDTO.getCity();
        this.addNote = guardianDTO.getAddNote();
        this.email = guardianDTO.getEmail();
    }

    public Guardian(String name, String lastName, String street, String city, String mobile, String email, String addNote) {
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.mobile = mobile;
        this.email = email;
        this.addNote = addNote;
    }
}
