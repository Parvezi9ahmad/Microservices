package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Autowired
	private Environment env;
	

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String port = env.getProperty("server.port");
		//To run this application click on run as configuration->select welcome API-In arguments section
	//vm arguments type(-Dserver.port=8081 till 8083)	
		String msg = "Welcome to Ashok It...(Server Port ::"+ port +") " ;
		return msg;
	}
}
