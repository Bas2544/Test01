package nvc.it.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {
    

    @GetMapping("/")
    public String index () {
        return "index";
    }

    @GetMapping("/book")
    public String book () {
        return "book";
    }

    @GetMapping("/customer")
    public String customer () {
        return "customer";
    }

    @GetMapping("/category")
    public String category () {
        return "category";
    }
    


}
