package pl.aniolySystem.webApp.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "guardian")
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "guardian_name")
    String name;

    @Column(name = "guardian_last_name")
    String lastName;

    @Column(name = "guardian_street")
    String street;

    @Column(name = "guardian_city")
    String city;

    @Column(name = "guardian_mobile")
    String mobile;

    @Column(name = "guardian_email")
    String email;

    @Column(name = "guardian_add_note")
    String addNote;

    public Guardian() {
    }

    public Guardian(String name, String lastName, String mobile) {
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddNote() {
        return addNote;
    }

    public void setAddNote(String addNote) {
        this.addNote = addNote;
    }
}
