package top.test.stsp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MiyaController {

	private Logger logger = LoggerFactory.getLogger(MiyaController.class);

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String home() {
		logger.info("hi is being called");
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info() {
		logger.info("info is being called");
		return restTemplate.getForObject("http://localhost:8002/info", String.class);
	}

}
