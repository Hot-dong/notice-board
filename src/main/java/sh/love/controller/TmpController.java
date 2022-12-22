package sh.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TmpController {

    @RequestMapping("/tmpMain")
    public String tmp1() {
        return "/tmp";
    }

    @RequestMapping("/tmpInsert")
    public String tmp2() {
        return "/tmp2";
    }

    @RequestMapping("/tmpDetail")
    public String tmp3(String sn, Model model) {
        model.addAttribute("sn", sn);
        return "/tmp3";
    }
}
