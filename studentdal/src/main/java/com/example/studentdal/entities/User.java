package com.example.studentdal.entities;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "User") // Specify the table name
public class User {

    @Id
    @Column(name = "user_name", length = 255, nullable = false, unique = true)
    private String userName;
    @Column(name = "password")
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "role")

    private Role role;

    @Column(name = "email", unique = true)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    private Date createDate;

    public User()
    {
        this.userName="user";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
