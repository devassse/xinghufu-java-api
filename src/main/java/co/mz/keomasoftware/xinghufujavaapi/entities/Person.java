package co.mz.keomasoftware.xinghufujavaapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String middlename;
    private String surname;
    private Date birthdate;
    private Date created_at;
    private Date updated_at;
    private Date created_by;
    private Date updated_by;

    public Person(){}

    public Person(long id, String name, String middlename, String surname, Date birthdate, Date created_at, Date updated_at, Date created_by, Date updated_by) {
        this.id = id;
        this.name = name;
        this.middlename = middlename;
        this.surname = surname;
        this.birthdate = birthdate;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by = created_by;
        this.updated_by = updated_by;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Date created_by) {
        this.created_by = created_by;
    }

    public Date getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Date updated_by) {
        this.updated_by = updated_by;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", created_by=" + created_by +
                ", updated_by=" + updated_by +
                '}';
    }
}
