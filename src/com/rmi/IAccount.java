package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.bean.User;

/**
 * @author framgiavn
 */
public interface IAccount extends Remote {

    /**
     * @return
     * @throws RemoteException
     */
    public User getUser() throws RemoteException;
}
