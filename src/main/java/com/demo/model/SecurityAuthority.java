package com.demo.model;

import org.springframework.security.core.GrantedAuthority;

import com.demo.entity.Authority;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority{
	private static final long serialVersionUID = 1L;
	private final Authority authority;

	@Override
	public String getAuthority() {
		
		return authority.getAuthoritieName();
	}

}
