package pull.man.pj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods/")
public class GoodsController {
	
@RequestMapping("doFindGoods")
public String doFindGoods() {
	
	return"";
}

}
