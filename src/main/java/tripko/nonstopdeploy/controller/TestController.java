package tripko.nonstopdeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public ResponseEntity<String> main(){
		return ResponseEntity.ok("blue");
	}
}
