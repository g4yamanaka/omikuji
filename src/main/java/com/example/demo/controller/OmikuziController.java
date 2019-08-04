package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.OmikuziService;

@Controller
public class OmikuziController {

    @Autowired
    OmikuziService service;

    @GetMapping("/omikuzi/home")
    public String getHome(Model model) {
        return "omikuzi/index";
    }

    @GetMapping("/omikuzi/result")
    public String postHome(Model model) {
        String fortuneMessage = service.getResult();
        String fortuneComment = service.getResultComment(fortuneMessage);

        model.addAttribute("fortuneMessage", fortuneMessage);
        model.addAttribute("fortuneComment", fortuneComment);

        return "omikuzi/result";
    }
}
