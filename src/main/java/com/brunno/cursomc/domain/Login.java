package com.brunno.cursomc.domain;

import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String email;
	private String passwd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
