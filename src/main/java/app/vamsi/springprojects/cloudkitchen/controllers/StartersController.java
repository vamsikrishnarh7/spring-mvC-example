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
public class StartersController {
    @GetMapping(value = "/starters", produces = MediaType.TEXT_PLAIN_VALUE)
//    @ResponseBody
    public String starter(){
        return "Starters:\n\n" +
                "\nGobi Manchurian - Rs.215" +
                "\nBaby Corn Manchurian - Rs.215" +
                "\nChilli Paneer - Rs.215" +
                "\nPaneer Manchurian - Rs.216" +
                "\nPaneer 65 - Rs.215" +
                "\nGinger Gobi - Rs.216" +
                "\nChilli Baby corn - Rs.225";
    }

}
