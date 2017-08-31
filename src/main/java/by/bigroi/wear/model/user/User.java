package by.bigroi.wear.model.user;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private long id;

    @Column(name = "SURNAME", nullable = false)
    @Pattern(regexp="^[\\pL '-]+$", message = "{user.surname.invalid}")
    private String surname;

    @Column(name = "NAME", nullable = false)
    @Pattern(regexp="^[\\pL '-]+$", message = "{user.name.invalid}")
    private String name;

    @Column(name = "EMAIL", nullable = false, unique = true)
    @Pattern(regexp="^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]+$", message = "{user.email.invalid}")
    private String email;

    @Size(min = 5, max = 15)
    @Column(name = "PASSWORD", nullable = false)
    @Pattern(regexp="^[a-zA-Z0-9]+$", message = "{user.password.invalid}")
    private String password;

    @Column(name = "PHONE", nullable = false, unique = true)
    @Pattern(regexp="^\\+[0-9][0-9][0-9]?[\\s]*\\(?\\d{2}\\)?[-\\s]?\\d{3}[-\\s]?\\d{2}[-\\s]?\\d{2}$", message = "{user.phone.invalid}")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "REG_DATE")
    @DateTimeFormat(pattern = "MM/dd/yy")
    private String regDate;
/*
    @ManyToOne
    @JoinColumn(name = "ID_ROLE")
    private UserRole role;*/

    //////////////// GETTERS + SETTERS ///////////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegData() {
        return regDate;
    }

    public void setRegData(String regData) {
        this.regDate = regData;
    }
/*
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    ///////////// EQUALS + HASHCODE + ToSTRING ///////////////////////

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id &&
                phone == user.phone &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(address, user.address) &&
                Objects.equals(regDate, user.regDate) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, email, password, phone, address, regDate, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", regData='" + regDate + '\'' +
                ", role=" + role +
                '}';
    }*/
}
