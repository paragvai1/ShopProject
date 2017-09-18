package by.bigroi.wear.model.user;

import javax.persistence.*;
import by.bigroi.wear.model.user.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER_ROLE")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE")
    private int id;

    @Column(name = "VALUE", nullable = false, unique = true)
    private String value;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    List<User> users = new ArrayList<>();

    ///////////// GETTERS + SETTERS ////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    ///////////// EQUALS + HASHCODE + ToSTRING ///////////////////////

}
