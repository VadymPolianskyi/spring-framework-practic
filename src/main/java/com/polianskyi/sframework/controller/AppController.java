package com.polianskyi.sframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/app")
@SessionAttributes("appAttr")
public class AppController {

    @GetMapping
    public String setupForm(@RequestParam int appId, ModelMap model) {
        model.addAttribute("appAttr", String.valueOf(appId));
        return "appForm";
    }
}
