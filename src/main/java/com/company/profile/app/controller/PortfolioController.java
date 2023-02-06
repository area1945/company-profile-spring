package com.company.profile.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PortfolioController {

    @GetMapping("/portfolio")
    public String index(Model model) {
        return "pages/portfolio"; 
    }
    
    @GetMapping("/portfolio/show")
    public String show(Model model) {
        return "pages/portfolio-show"; 
    }

}