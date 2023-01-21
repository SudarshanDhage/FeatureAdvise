package com.featureadvise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.featureadvise.domain.User;
import com.featureadvise.repository.UserRepository;
import com.featureadvise.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepo;
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepo.findByUsername(username);
    
    if (user == null)
      throw new UsernameNotFoundException("Invalid Username and password");
    
    return new CustomSecurityUser(user);
  }

}
