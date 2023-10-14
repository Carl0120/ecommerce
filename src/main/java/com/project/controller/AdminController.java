package com.project.controller;

import com.project.Config.Routes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("")
    public ModelAndView admin(){
        return new ModelAndView(Routes.ADMIN_HOME);
    }

}
