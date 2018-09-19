package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jd on 2018.09.19..
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/index","/index.html"})
    public String index() {
        return "owners/index";
    }

}
