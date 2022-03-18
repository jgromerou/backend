package com.portfolio.backend.payload.response;

import java.util.List;

public class UserInfoResponse {
	private Long id;
	private String usuario;
	private String email;
	private List<String> roles;

	public UserInfoResponse(Long id, String usuario, String email, List<String> roles) {
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<String> getRoles() {
		return roles;
	}
}
