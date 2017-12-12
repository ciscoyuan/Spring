package com.finals.sys.model;

import java.io.Serializable;

public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String userCode;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}