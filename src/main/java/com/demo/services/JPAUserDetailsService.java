package com.demo.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.model.SecurityUser;
import com.demo.repository.UserRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class JPAUserDetailsService implements UserDetailsService{
	
	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		return user.map(SecurityUser::new).orElseThrow(()->new UsernameNotFoundException("(:"));
	}

}
