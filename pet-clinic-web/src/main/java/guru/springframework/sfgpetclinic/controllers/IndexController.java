package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jd on 2018.09.19..
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index() {
        return "index";
    }

}
