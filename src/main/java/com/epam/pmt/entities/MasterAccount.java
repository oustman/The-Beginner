package com.epam.pmt.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Master_Account_TBL")
public class MasterAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MASTER_ID_GENERATOR")
    @SequenceGenerator(name = "MASTER_ID_GENERATOR", sequenceName = "MASTER_ACCOUNT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private int id;

    @Column(name = "FULL_NAME", length = 32)
    private String fullName;

    @Column(name = "USER_NAME", length = 32)
    private String userName;


    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(mappedBy = "masterAccount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Group> groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
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

    @Override
    public String toString() {
        return "MasterAccount{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +

                ", password='" + password + '\'' +
                ", groups=" + groups +
                '}';
    }
}
