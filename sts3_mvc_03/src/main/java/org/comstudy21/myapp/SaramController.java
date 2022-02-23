package org.comstudy21.myapp;

import java.util.ArrayList;

import org.comstudy21.myapp.saram.SaramDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/saram")
public class SaramController {
	
	private static ArrayList<SaramDto> saramList = new ArrayList<>();
	
	static {
		saramList.add(new SaramDto(SaramDto.nextSeq(),"KIM","김길동","kim@kim.com"));
		saramList.add(new SaramDto(SaramDto.nextSeq(),"LEE","이길동","lee@lee.com"));
		saramList.add(new SaramDto(SaramDto.nextSeq(),"PARK","박길동","park@park.com"));
	}
	
	@RequestMapping(value = "list.action", method = RequestMethod.GET)
	public String saramList(Model model) {
		model.addAttribute("saramList", saramList);
		
		return "saram/list";
	}
	
	@RequestMapping(value = "input.action", method = RequestMethod.GET)
	public String saramInput() {
		return "saram/input";
	}

	@RequestMapping(value = "detail.action", method = RequestMethod.GET)
	public String saramDetail(Model model, SaramDto dto) {
		// idx가 같은 요소가 몇번 index에 있는지 검사
		if(saramList.indexOf(dto) != -1) {
			int index = saramList.indexOf(dto);
			SaramDto saram = saramList.get(index);
			model.addAttribute("saramDto",saram);
		}else {
			System.out.println("없음");
		}
		
		return "saram/detail";
	}
	
	@RequestMapping(value = "modify.action", method = RequestMethod.GET)
	public String saramModify(Model model, SaramDto dto) {
		if(saramList.indexOf(dto) != -1) {
			System.out.println(dto);
			int index = saramList.indexOf(dto);
			SaramDto saram = saramList.get(index);
			model.addAttribute("saramDto",saram);
		}
		return "saram/modify";
	}
	@RequestMapping(value = "modify.action", method = RequestMethod.POST)
	public String saramModify(SaramDto dto) {
		if(saramList.indexOf(dto) != -1) {
			int i = saramList.indexOf(dto);
			SaramDto saram = saramList.get(i);
			saram.setData(dto);
			saramList.set(saramList.indexOf(saram), saram);
		}
		return "redirect:list.action";
	}
	
	@RequestMapping(value = "input.action", method = RequestMethod.POST)
	public String saramInput(Model model, SaramDto dto) {
		dto.setIdx(SaramDto.nextSeq());
		saramList.add(dto);
		
		return "redirect:list.action";
	}
	
	@RequestMapping(value = "delete.action", method = RequestMethod.GET)
	public String saramDelete(SaramDto dto) {
		if(saramList.indexOf(dto) != -1) {
			int i = saramList.indexOf(dto);
			saramList.remove(i);
		}
		return "redirect:list.action";
	}
}
