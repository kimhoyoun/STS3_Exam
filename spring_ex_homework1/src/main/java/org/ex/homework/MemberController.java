package org.ex.homework;

import org.ex.homework.model.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	

	@RequestMapping(value = "login.action", method = RequestMethod.GET)
	public String login() {
		
		return "member/login";
	}
	
	@RequestMapping(value = "login.action", method = RequestMethod.POST)
	public String login(MemberDto dto) {
			
		return "member/login";
	}
}
