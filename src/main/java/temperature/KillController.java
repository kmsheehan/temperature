package temperature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KillController {
	
	@RequestMapping(value="/killApp")
    public @ResponseBody String kill(){
		System.exit(-1);    	
    	return "Killed";

    }       

}
