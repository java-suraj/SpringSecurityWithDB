package com.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	@SequenceGenerator(sequenceName = "USER_SEQ", allocationSize = 1, name = "USER_SEQ")
	private Long userId;
	private String username;
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="AUTHOROTIES_USER",
	joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="AUTHOROTIE_ID"))
	private Set<Authority> authorities;
}
