package com.featureadvise.services;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceImplTest {

	@SuppressWarnings("deprecation")
	@Test
	public void generate_encrypted_password () {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawPassword = "123";
		String encodedPassword=encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		assertThat(rawPassword, not(encodedPassword));
	}

}
