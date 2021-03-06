package com.twu;

import com.twu.users.NullUser;
import com.twu.users.User;

import java.util.ArrayList;
import java.util.Set;

// It is used to authenticate the users.

public class Authenticator {
    private Set<User> allUsers;
    private NullUser nullUser;
    private ArrayList<User> list;

    public Authenticator(Set<User> allUsers, NullUser nullUser, ArrayList<User> list) {
        this.allUsers = allUsers;
        this.nullUser = nullUser;
        this.list = list;
    }

    public User validateUser(String libraryNumber, String password) {
        list.clear();
        for (User user : allUsers)
            user.addToListIfCredentialsMatch(list, libraryNumber, password);
        if (list.size() > 0)
            return list.get(0);
        else return nullUser;
    }
}
