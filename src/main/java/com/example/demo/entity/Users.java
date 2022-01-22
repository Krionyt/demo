package com.example.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @NotNull
    private String firstName;

    @NotNull
    private String secondName;

    private String middleName;

    @NotNull
    private String login;

    @NotNull
    private String password;

    public Users() { }

    public Users(Long idUser, String firstName, String secondName, String middleName, String login, String password) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.login = login;
        this.password = password;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
