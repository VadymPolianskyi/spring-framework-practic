package com.polianskyi.sframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app")
@SessionAttributes("appAttr")
public class AppController {

    @GetMapping
    public String setupForm(@RequestParam int appId, ModelMap model) {
        model.addAttribute("appAttr", String.valueOf(appId));
        return "appForm";
    }

    @RequestMapping("/displayHeadelInfo.do")
    public void displayHeadelInfo(@RequestHeader("Accept-Encoding") String encoding,
                                  @RequestHeader("Keep-Alive") long keepAlive) {
        
    }
}
