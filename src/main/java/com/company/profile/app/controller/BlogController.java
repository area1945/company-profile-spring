package com.company.profile.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String index(Model model) {
        return "pages/blog"; 
    }
    
    @GetMapping("/blog/show")
    public String show(Model model) {
        return "pages/blog-show"; 
    }

}