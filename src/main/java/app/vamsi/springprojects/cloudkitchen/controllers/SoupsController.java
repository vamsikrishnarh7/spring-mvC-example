package app.vamsi.springprojects.cloudkitchen.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/menu")
public class SoupsController {
    @GetMapping(value = "/soups",produces = MediaType.TEXT_PLAIN_VALUE)
//    @ResponseBody
    public String soups(){
        return "Soups:\n\n" +
                "\nVeg manchow soup - Rs.138" +
                "\nVeg hot and sour soup - Rs.138" +
                "\nLemon coriander soup - Rs.138";
    }
}
