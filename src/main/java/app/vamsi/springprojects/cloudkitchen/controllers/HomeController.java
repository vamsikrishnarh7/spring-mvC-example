package app.vamsi.springprojects.cloudkitchen.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
//    @ResponseBody()
    public String home(){
        return "Welcome to Cloud Kitchen.\n\nHere is your menu\n\nGo to /menu/starters for Starters\nGo to /menu/main-courses for Main Courses" +
                "\nGo to /menu/rice-biryani for Rice and Biryani"+
                "\nGo to /menu/soups for Soups" +
                "\n\nuse \"CLOUDKITCHEN30\" to get FLAT 30% off on any item";
    }
}
