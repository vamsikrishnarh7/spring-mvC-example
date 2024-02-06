package app.vamsi.springprojects.cloudkitchen.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

//@Controller
@RestController
@RequestMapping("/menu")
public class RiceAndBiryaniController {
    @GetMapping(value = "/rice-biryani",produces = MediaType.TEXT_PLAIN_VALUE)
//    @ResponseBody
    public String riceAndBiryani(){
        return "Rice and Biryani:\n\n" +
                "\nVeg Biryani - Rs.250" +
                "\nHyd Dum Biryani - Rs.270" +
                "\nPaneer Biryani - Rs.260" +
                "\nCurd Rice - Rs.90" +
                "\nSpl Curd Rice - Rs.135";
    }
}
