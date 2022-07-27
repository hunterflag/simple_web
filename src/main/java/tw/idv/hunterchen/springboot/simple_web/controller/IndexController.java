package tw.idv.hunterchen.springboot.simple_web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tw.idv.hunterchen.springboot.simple_web.service.IndexService;

@RestController
@Slf4j
public class IndexController {
//	@Value("${spring.application.name}")
	@Value("${app.info.author}")
	private String appName;
	
	@Autowired
	IndexService service;
	
	
	@RequestMapping(value={"/", "/hello"})
//	@ResponseBody
	public String index(
				  @RequestParam(defaultValue = "none") 	String name
				, @RequestHeader("Accept-Language") 	String acceptLanguage
				, @RequestHeader("User-Agent") 			String userAgent
			) {
		log.info("\n<=MBH=> Hello, 我收到了! \n {} and {} ", name, appName);
		
		log.info("\n<=MBH=> 從 service 取得 {} ", service.getMyAuthor());
		return "<H1>Hello World!</H1> " + name;
	}
	
}
