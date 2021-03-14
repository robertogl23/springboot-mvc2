package com.devrob.servicesNotesApp.user.entity;



import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private int idUser;

    @NotNull
    @Column(unique=true,nullable = false,length = 20)
    @Max(20)
    private String userName;

    @NotNull
    @Column(unique=true,nullable = false,length = 35)
    @Max(35)
    private  String email;

    @Column(nullable = false,length = 30)
    @Min(10)
    private String password;

    //@OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
    //private Note note;
    public User() {
    }

    public User(int idUser, String userName, String email, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


}
