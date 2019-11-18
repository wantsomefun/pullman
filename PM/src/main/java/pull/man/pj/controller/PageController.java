package pull.man.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@RequestMapping("doStartUI")
	public String doStartUI() {
		return"starter";
	}
	
	//变量路径
@RequestMapping("{module}/{moduleUI}")
public String doModelUi(@PathVariable String moduleUI) {
	
	
	return "sys/"+moduleUI;
	
}
}