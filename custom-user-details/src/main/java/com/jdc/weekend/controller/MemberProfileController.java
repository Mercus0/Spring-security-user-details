package com.jdc.weekend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member/profile")
public class MemberProfileController {
	
	@GetMapping()
	String profile() {
		return "member-profile";
	}
	
	@GetMapping("edit")
	String editProfile() {
		return "member-profile-edit";
	}
	
	@PostMapping("edit")
	String saveProfile() {
		return "redirect:/member/profile";
	}
}
