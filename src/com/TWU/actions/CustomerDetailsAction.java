package com.twu.actions;

import com.twu.Option;
import com.twu.users.User;

public class CustomerDetailsAction implements Option{
    @Override
    public void perform(User customer) {
     System.out.println(customer.toString());
    }
}
