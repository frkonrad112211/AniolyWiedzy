package pl.aniolySystem.webApp.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "child")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "child_name")
    String name;

    @Column(name = "child_last_name")
    String lastName;

    @Column(name = "child_birth_date")
    Date birthDate;

    @Column(name = "child_street")
    String street;

    @Column(name = "child_city")
    String city;

    @Column(name = "child_mobile")
    String mobile;

    @Column(name = "child_help")
    String help;

    @Column(name = "child_school")
    String school;

    @Column(name = "child_hobbies")
    String hobbies;

    @Column(name = "child_possibilities")
    String possibilities;

    @Column(name = "child_add_note")
    String addNote;

    public Child() {
    }

    public Child(String name, String lastName, Date birthDate, String street, String city, String mobile, String help) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.street = street;
        this.city = city;
        this.mobile = mobile;
        this.help = help;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(String possibilities) {
        this.possibilities = possibilities;
    }

    public String getAddNote() {
        return addNote;
    }

    public void setAddNote(String addNote) {
        this.addNote = addNote;
    }
}
