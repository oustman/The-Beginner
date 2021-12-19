package com.epam.pmt.session;

import com.epam.pmt.entities.MasterAccount;

public class ActiveUser {
    private static MasterAccount activeUser;

    private ActiveUser() {
    }

    public static MasterAccount getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(MasterAccount activeUser) {
        ActiveUser.activeUser = activeUser;
    }
}
