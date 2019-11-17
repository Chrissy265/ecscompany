package com.spring.escompany;
/**
 * Get user by username. Login process.
 *
 * @param username The user's name
 * @return UserDetails object
 * @throws UsernameNotFoundException No user found
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findByUsername(username);
		if (user==null)
			throw new UsernameNotFoundException("No user found with username " + username);
		
		return new UserPrincipal(user);
	}

}