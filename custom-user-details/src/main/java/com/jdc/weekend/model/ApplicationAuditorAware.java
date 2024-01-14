package com.jdc.weekend.model;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

public class ApplicationAuditorAware implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(SecurityContextHolder.getContext())
				.map(a->a.getAuthentication())
				.map(a->a.getName());
	}
	
}
