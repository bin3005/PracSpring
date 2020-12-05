package com.mapping.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapping.mvc.dto.AddressDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/command.do" , method = RequestMethod.GET)
	public String getCommand(Model model, @ModelAttribute AddressDto dto) {
		//@ModelAttribute -> 모델로 넘어온값 자동으로 매핑
		model.addAttribute("dto", dto);
		
		
		return "getcommand";
	}
	
	@RequestMapping(value = "/command.do" , method = RequestMethod.POST)
	public String postCommand(Model model, String name,@RequestParam("addr") String address, String phone) {
		model.addAttribute("dto", new AddressDto(name, address, phone));
		
		
		return "postcommand";
	}
}
