package org.comstudy21.myapp;

import java.util.ArrayList;

import org.comstudy21.myapp.saram.SaramDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/saram")
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
	
	@RequestMapping(value = "input.action", method = RequestMethod.POST)
	public String saramInput(SaramDto dto) {
		dto.setIdx(SaramDto.nextSeq());
		saramList.add(dto);
		// list에 변화를 주면 새로고침후 호출
		return "redirect:list.action";
	}
	
	@RequestMapping(value = "detail.action", method = RequestMethod.GET)
	public String saramDetail(Model model, SaramDto dto) {
		// detail.action이 실행되면 객체의 idx를 비교하여 list에서 고유번호가 일치하는 객체가 있다면 그 객체의 정보를 담고 detail page에 넘겨줌.
		if(saramList.indexOf(dto) != -1) {
			int index = saramList.indexOf(dto);
			SaramDto saram = saramList.get(index);
			model.addAttribute("saramDto",saram);
		}
		return "saram/detail";
	}
	
	@RequestMapping(value = "modify.action", method = RequestMethod.GET)
	public String saramModify(Model model, SaramDto dto) {
		// detail page에서 modify로 이동할 때 고유번호를 넘겨주고 그 고유번호로 saramList에서 saramDto객체 찾아서 전달.
		if(saramList.indexOf(dto) != -1) {
			int index = saramList.indexOf(dto);
			SaramDto saram = saramList.get(index);
			model.addAttribute("saramDto",saram);
		}
		return "saram/modify";
	}
	
	@RequestMapping(value = "modify.action", method = RequestMethod.POST)
	public String saramModify(SaramDto dto) {
		// 변경된 dto전달받고 saramList에 저장되어있는 같은 고유번호를 가진 dto를 그 인덱스에 수정된 dto로 교체
		if(saramList.indexOf(dto) != -1) {
			int index = saramList.indexOf(dto);
			saramList.set(index, dto);
		}
		return "redirect:list.action";
	}
	
	@RequestMapping(value = "delete.action", method = RequestMethod.GET)
	public String saramDelete(SaramDto dto) {
		// 고유번호가 일치하는 객체가 리스트에 있다면 해당 객체 삭제
		if(saramList.indexOf(dto) != -1) {
			saramList.remove(dto);
		}
		return "redirect:list.action";
	}
}
