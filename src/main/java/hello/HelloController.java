package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
	@RequestMapping(method=RequestMethod.POST, value="/webhook")
    public String index(@RequestBody String requestJson ) {
        return "{\"data\": {\"facebook\": \"We're working on it\"}}";
    }
    
}
