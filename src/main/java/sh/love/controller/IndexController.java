package sh.love.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sh.love.service.MainService;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "")
    public String main(Model model){
        return "/user/index/index";
    }

}
