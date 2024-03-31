package io.javaBrains.SpringBootStarter.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/Hello")
	public String sayHi() {
		return "Champ is the best <span style=\"font-size:150%;color:red;\">&hearts;</span>.\n";
	}

}
