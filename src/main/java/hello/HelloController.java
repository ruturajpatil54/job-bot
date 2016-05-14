package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
	@RequestMapping(method=RequestMethod.POST, value="/webhook")
    public String index(@RequestBody String requestJson ) {
        return "{\"recipient\":{\"id\":\"USER_ID\"},"
        		+ "\"message\":{"
        		+ "\"attachment\":{"
        		+ "\"type\":\"template\","
        		+ "\"payload\":{\"template_type\":\"button\",\"text\":\"What do you want to do next?\",\"buttons\":[{\"type\":\"web_url\",\"url\":\"https://petersapparel.parseapp.com\","
        		+ "\"title\":\"Show Website\"},{\"type\":\"postback\",\"title\":\"Start Chatting\",\"payload\":\"USER_DEFINED_PAYLOAD\""
        		+ "}]}}}}";
    }
    
}