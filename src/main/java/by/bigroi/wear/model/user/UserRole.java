package by.bigroi.wear.model.user;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE")
    private int id;

    @Column(name = "VALUE", nullable = false, unique = true)
    private String value;

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private List<User> users = new ArrayList<>();


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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserRole userRole = (UserRole) object;
        return id == userRole.id &&
                Objects.equals(value, userRole.value) &&
                Objects.equals(users, userRole.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, users);
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", users=" + users +
                '}';
    }*/
}
