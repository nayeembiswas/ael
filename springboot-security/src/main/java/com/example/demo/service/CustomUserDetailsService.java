package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.utill.CustomUserDetails;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	@Autowired
	AppUserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
		
		if(!user.getActive()) {
			throw new UsernameNotFoundException("User is not active with username: " + username);
		}
		
		if(user.getAccountExpired()) {
			throw new UsernameNotFoundException("User is expired with username: " + username);
		}
		
		if(user.getAccountLocked()) {
			throw new UsernameNotFoundException("User is locked with username: " + username);
		}
		
		if(user.getCredentialsExpired()) {
			throw new UsernameNotFoundException("User credentials expired with username: " + username);
		}

		return CustomUserDetails.build(user);
	}
	
	
	
	

}