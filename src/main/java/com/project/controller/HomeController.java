package com.project.controller;

import com.project.Util.Routes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping("")
    public ModelAndView home(){
        return new ModelAndView(Routes.ADMIN_HOME);
    }

}
