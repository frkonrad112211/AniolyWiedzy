package pl.aniolySystem.webApp.Entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.aniolySystem.webApp.DTO.ChildDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String lastName;
    Date birthDate;
    String street;
    String city;
    String mobile;
    String help;
    String school;
    String hobbies;
    String possibilities;
    String addNote;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "care",
            joinColumns = { @JoinColumn(name = "child_id") },
            inverseJoinColumns = { @JoinColumn(name = "guardian_id") }
    )
    Set<Guardian> guardianList;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "teach",
            joinColumns = { @JoinColumn(name = "child_id") },
            inverseJoinColumns = { @JoinColumn(name = "volo_id") }
    )
    Set<Volo> voloList;



    public Child(String name, String lastName, Date birthDate, String street, String city, String mobile, String help, String school, String hobbies, String possibilities, String addNote) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.street = street;
        this.city = city;
        this.mobile = mobile;
        this.help = help;
        this.school = school;
        this.hobbies = hobbies;
        this.possibilities = possibilities;
        this.addNote = addNote;
    }

    public void fromChildDTOtoChild(ChildDTO childDTO){
        this.name = childDTO.getName();
        this.lastName = childDTO.getLastName();
        this.birthDate = childDTO.getBirthDate();
        this.city = childDTO.getCity();
        this.help = childDTO.getHelp();
        this.mobile = childDTO.getMobile();
        this.street = childDTO.getStreet();
        this.addNote = childDTO.getAddNote();
        this.hobbies = childDTO.getHobbies();
        this.possibilities = childDTO.getPossibilities();
        this.school = childDTO.getSchool();

    }

}
