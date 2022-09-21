package com.yedam.quiz.users.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UsersVO implements UserDetails{
	
	private String id;
	private String pw;
	private String role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	     //List<GrantedAuthority> auth = new ArrayList<>();
	     //auth.add(new SimpleGrantedAuthority(this.role));
	     //return auth;
	     
	     return Collections.singletonList(new SimpleGrantedAuthority(this.role));
	}

	@Override
	public String getPassword() {
		return this.pw;
	}

	@Override
	public String getUsername() {
		return this.id;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
