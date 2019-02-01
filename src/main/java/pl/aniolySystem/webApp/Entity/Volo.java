package pl.aniolySystem.webApp.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Volo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String lastName;
    String role;
    Date comeDate;
    Date birthDate;
    String street;
    String city;
    String mobile;
    String email;
    String canHelpWith;
    String addNote;
    String status;
    String neighbourhood;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "teach",
            joinColumns = { @JoinColumn(name = "volo_id") },
            inverseJoinColumns = { @JoinColumn(name = "child_id") }
    )
    List<Child> childList;

    public Volo(String name, String lastName, String role, Date comeDate, Date birthDate,
                String street, String city, String mobile, String email, String canHelpWith,
                String addNote, String status, String neighbourhood) {
        this.name = name;
        this.lastName = lastName;
        this.role = role;
        this.comeDate = comeDate;
        this.birthDate = birthDate;
        this.street = street;
        this.city = city;
        this.mobile = mobile;
        this.email = email;
        this.canHelpWith = canHelpWith;
        this.addNote = addNote;
        this.status = status;
        this.neighbourhood = neighbourhood;
    }
}