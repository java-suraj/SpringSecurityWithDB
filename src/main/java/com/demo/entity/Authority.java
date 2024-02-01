package com.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="AUTHOROTIES")
public class Authority {
	
	@Id
	private Long authorotieId;
	private String authoritieName;
	
	@ManyToMany(mappedBy = "authorities")
	  private Set<User> users;
	

}
