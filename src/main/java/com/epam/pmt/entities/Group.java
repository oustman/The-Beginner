package com.epam.pmt.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GROUP_TBL")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GROUP_ID_GENERATOR")
    @SequenceGenerator(name = "GROUP_ID_GENERATOR", sequenceName = "GROUP_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private int id;

    @Column(name = "GROUP_NAME", length = 32)
    private String groupName;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "MASTER_ACCOUNT_ID")
    private MasterAccount masterAccount;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PasswordAccount> passwordAccounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<PasswordAccount> getPasswordAccounts() {
        return passwordAccounts;
    }

    public void setPasswordAccounts(List<PasswordAccount> passwordAccounts) {
        this.passwordAccounts = passwordAccounts;
    }

    public MasterAccount getMasterAccount() {
        return masterAccount;
    }

    public void setMasterAccount(MasterAccount masterAccount) {
        this.masterAccount = masterAccount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", masterAccount=" + masterAccount +
                ", passwordAccounts=" + passwordAccounts +
                '}';
    }
}
