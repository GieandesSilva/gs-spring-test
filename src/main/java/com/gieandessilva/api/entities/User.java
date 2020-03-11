package com.gieandessilva.api.entities;

import java.util.List;

import com.gieandessilva.api.entities.Role;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

	private @Id @GeneratedValue Long id;
	private String name;
	@Column(unique = true)
	private String email;
	@JsonIgnore
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

	private List<Role> roles;

	public User() {
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public User(User user) {
		super();
		this.name = user.getName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.roles = user.getRoles();
		this.id = user.getId();
	}

	public User(String name, String email, String password, List<Role> role) {
		super();
		this.name = name;
		this.email = email;
		this.roles = role;
		this.password = password;
	}

}
