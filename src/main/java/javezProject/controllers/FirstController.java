package javezProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mainpage")
public class FirstController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name", required = false) String name,
                             @RequestParam(value = "surname", required = false) String surname,
                             Model model) {

        //System.out.println(name + " " + surname);
        model.addAttribute("message", name + " " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodBye() {
        return "first/goodbye";
    }
}
