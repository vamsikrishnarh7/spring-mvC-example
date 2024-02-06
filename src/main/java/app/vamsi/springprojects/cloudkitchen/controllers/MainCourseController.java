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
public class MainCourseController {
    @GetMapping(value = "/main-course",produces = MediaType.TEXT_PLAIN_VALUE)
//    @ResponseBody
    public String mainCourses(){
        return "Main Courses:\n\n" +
                "\nDal fry - Rs.210" +
                "\nDal Tadka - Rs.222" +
                "\nPalak Paneer - Rs.222" +
                "\nKadhai Paneer - Rs.228" +
                "\nKaju Paneer - Rs.240";
    }
}
