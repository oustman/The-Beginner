package com.epam.pmt.entities;

import javax.persistence.*;

@Entity
@Table(name = "PASSWORD_ACCOUNT_TBL")
public class PasswordAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PASSWORD_ID_GENERATOR")
    @SequenceGenerator(name = "PASSWORD_ID_GENERATOR", sequenceName = "PASSWORD_ACCOUNT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private int id;

    @Column(name = "ACCOUNT_NAME", length = 32)
    private String accountName;

    @Column(name = "USER_NAME", length = 64)
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "URL", length = 64)
    private String url;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "PasswordAccount{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", group=" + group +
                '}';
    }
}
