package com.zinkworks.MySpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//@Controller class handles HTTP requests and return webpages(views)
@Controller
public class HomeController {
    //@GetMapping ->HTTP Get requests for root Urls
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title","MY-URLSHORTENER");
        return "home.html";
    }
    @GetMapping("/about")
    public String about(){
        return "about.html";
    }
}
