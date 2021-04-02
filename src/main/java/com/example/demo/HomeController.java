package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")

    public String homeOne(Model model){
        model.addAttribute("result","see the model simple");
        return "index";
    }

    @RequestMapping("/loadform")
    public String loadForm(){
        return "form";
    }

    @RequestMapping("/processform")
    public String processForm(@RequestParam("login") String login,Model model){
        model.addAttribute("loginval",login);
        return "confirm";
    }

    @GetMapping("/songform")
    public String loadSongFormpage(Model model){
        model.addAttribute("song",new Song());
        return "songformone";
    }

    @PostMapping("/songprocess")
    public String loadFromPage(@ModelAttribute Song song,Model model){
        model.addAttribute("realsong",song);
        return "confirmsongone";
    }
}
