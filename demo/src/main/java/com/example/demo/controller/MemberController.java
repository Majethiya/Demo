package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@RestController
@CrossOrigin
@RequestMapping("/member")
public class MemberController {

	
	@Autowired
	MemberService memberService;
	
	@PostMapping("/add")
	public int AddMember(@RequestBody Member member) {
		
		int status=memberService.addMember(member);
		if(status>0) {
			return 1;
		}else {
			return 0;
				
		}
	}
}
