package com.sept.server.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.bean.User;
import com.rmi.IAccount;

/**
 * 
 * @author framgiavn
 *
 */
public class AccountServiceImpl extends UnicastRemoteObject implements IAccount {
    private static final long serialVersionUID = 1L;

    public AccountServiceImpl() throws RemoteException {
    }

    public User getUser() {
        User u = new User();
        u.setId(23);
        u.setUname("xwqiang");
        u.setPasswd("222");
        return u;
    }
}
