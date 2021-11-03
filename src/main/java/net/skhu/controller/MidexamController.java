package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MidexamController {

    @GetMapping("midexam/exam1")
    public String text2(Model model) {
        model.addAttribute("now", new Date());
        return "midexam/exam1";
    }

    @PostMapping("midexam/exam1")
    public String text2(Model model, String param1, String param2, String param3) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        model.addAttribute("param3", param3);
        model.addAttribute("now", new Date());
        return "midexam/exam1";
    }

}
