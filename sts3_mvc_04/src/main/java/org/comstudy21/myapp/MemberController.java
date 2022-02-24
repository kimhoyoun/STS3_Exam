package org.comstudy21.myapp;

import java.util.ArrayList;

import org.comstudy21.member.MemberDto;
import org.comstudy21.myapp.saram.SaramDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	private static ArrayList<MemberDto> memberList = new ArrayList();
	
	static {
		memberList.add(new MemberDto(MemberDto.nextSeq(),"KIM","김길동","kim","kim@kim.com"));
		memberList.add(new MemberDto(MemberDto.nextSeq(),"LEE","이길동","lee","lee@lee.com"));
		memberList.add(new MemberDto(MemberDto.nextSeq(),"PARK","박길동","park","park@park.com"));
	}
	
	@RequestMapping(value = "list.action", method = RequestMethod.GET)
	public String memberList(Model model) {
		model.addAttribute("memberList", memberList);
		return "member/list";
	}
	
	@RequestMapping(value = "login.action", method = RequestMethod.GET)
	public String memberLogin() {
		
		return "member/login";
	}
}
