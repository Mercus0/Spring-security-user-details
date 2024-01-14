package com.jdc.weekend.model.input;

import jakarta.validation.constraints.NotBlank;

public record ChangePasswordForm(
	@NotBlank(message="please enter old password")
	String oldPassword,
	@NotBlank(message="please enter new password")
	String newPassword) {
	
}
