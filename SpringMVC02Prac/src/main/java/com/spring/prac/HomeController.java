package com.spring.prac;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.prac.model.biz.BoardBiz;
import com.spring.prac.model.dto.BoardDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("[리스트 출력");
		model.addAttribute("list", biz.selectAll());
		
		return "list";
	}
	
	@RequestMapping("/detail.do")
	public String boardDetail(Model model, int myno) {
		logger.info("글 클릭");
		model.addAttribute("dto", biz.selectOne(myno));
		
		return "boardDetail";
	}
	
	@RequestMapping("/boardUpdateForm.do")
	public String boardWrite(Model model, int myno ) {
		
		model.addAttribute("dto", biz.selectOne(myno));
		return "boardUpdateForm";
	}
	@RequestMapping("/boardUpdate.do")
	public String boardUpdate(BoardDto dto) {
		logger.info("글 수정");
		
		int res = biz.updateBoard(dto);
		
		if( res > 0 ) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:boardUpdateForm.do?myno="+dto.getMyno();
		}
	}
	@RequestMapping("/boardDelete.do")
	public String boardDelete(int myno) {
		logger.info("글 삭제");
		
		int res = biz.deleteBoard(myno);
		
		if (res > 0) {
			return "redirect:list.do";
		}else {
			return "redirect:detail.do?myno="+myno;
		}
	}
	
	@RequestMapping("/boardwriteform.do")
	public String boardWriteform() {
		logger.info("글쓰기");
		return "boardwriteform";
	}
	
	@RequestMapping("/boardWrite.do")
	public String boardWrite(BoardDto dto) {
		
		int res = biz.insertBoard(dto);
		
		if( res > 0) {
			return "redirect:list.do";
		}else {
			return "redirect:boardwriteform.do";
		}
	}
	
}
