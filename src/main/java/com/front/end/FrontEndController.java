package com.front.end;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/time")
public class FrontEndController {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	@GetMapping
	public String getCurrentTime(Model model) {
		LocalDateTime now = LocalDateTime.now();
		String nowDate = now.format(formatter);
		model.addAttribute("time", nowDate);
		return "front";
	}
}
