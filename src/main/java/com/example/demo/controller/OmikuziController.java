package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.OmikuziService;

@Controller
public class OmikuziController {

    @Autowired
    OmikuziService service;

    @GetMapping("/omikuzi")
    public String getHome(Model model) {
        return "omikuzi/home";
    }

    @PostMapping("/omikuzi")
    public String postHome(@RequestParam(value="name") String playerName, Model model) {
        String fortuneMessage = service.getResult();
        String fortuneComment = service.getResultComment(fortuneMessage);

        model.addAttribute("playerName", playerName);
        model.addAttribute("fortuneMessage", fortuneMessage);
        model.addAttribute("fortuneComment", fortuneComment);

        return "omikuzi/home";
    }
}
