package org.spring.boot.tutorial.banner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BannerController {
	@RequestMapping("/")
	@ResponseBody
	public String banner(){
		return "Banner";
	}
}
