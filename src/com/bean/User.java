package com.bean;

import java.io.Serializable;

/**
 * 
 * @author framgiavn
 *
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String uname;
    private String passwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
