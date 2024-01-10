package ar.com.cdt.fullstack.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
@CrossOrigin(origins = "*")
public class HealthCheckController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/ping")
	public String ping() {
		return "OK";
	};

}