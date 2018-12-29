package pl.aniolySystem.webApp.Entity;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "volo")
public class Volo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "volo_name")
    String name;

    @Column(name = "volo_last_name")
    String lastName;

    @Column(name = "volo_role")
    String role;

    @Column(name = "volo_come_date")
    Date comeDate;

    @Column(name = "volo_birth_date")
    Date birthDate;

    @Column(name = "volo_street")
    String street;

    @Column(name = "volo_city")
    String city;

    @Column(name = "volo_mobile")
    String mobile;

    @Column(name = "volo_email")
    String email;

    @Column(name = "volo_can_help_with")
    String canHelpWith;

    @Column(name = "volo_add_note")
    String addNote;

    @Column(name = "volo_status")
    String status;

    @Column(name = "volo_neighbourhood")
    String neighbourhood;

    public Volo() {
    }

    public Volo(String name, String lastName, String role, String street, String city, String mobile, String email, String status) {
        this.name = name;
        this.lastName = lastName;
        this.role = role;
        this.street = street;
        this.city = city;
        this.mobile = mobile;
        this.email = email;
        this.status = status;
    }

    public Volo(String name, String lastName, String role, Date comeDate, Date birthDate, String street, String city, String mobile, String email, String canHelpWith, String addNote, String status, String neighbourhood) {
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


    @Override
    public String toString() {
        return "Volo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", comeDate=" + comeDate +
                ", birthDate=" + birthDate +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", canHelpWith='" + canHelpWith + '\'' +
                ", addNotes='" + addNote + '\'' +
                ", status=" + status +
                ", neighbourhood='" + neighbourhood + '\'' +
                '}';
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getComeDate() {
        return comeDate;
    }

    public void setComeDate(Date comeDate) {
        this.comeDate = comeDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCanHelpWith() {
        return canHelpWith;
    }

    public void setCanHelpWith(String canHelpWith) {
        this.canHelpWith = canHelpWith;
    }

    public String getAddNote() {
        return addNote;
    }

    public void setAddNote(String addNote) {
        this.addNote = addNote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }
}