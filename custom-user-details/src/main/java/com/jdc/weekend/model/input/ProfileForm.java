package com.jdc.weekend.model.input;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;

public record ProfileForm(
		@NotBlank(message="please enter user name")
		String name,
		@NotBlank(message="please enter user name")
		String phone,
		@NotBlank(message="please enter user name")
		String greeting,
		String imageUrl,
		@NotBlank(message="please enter user name")
		MultipartFile image) {
	
}
