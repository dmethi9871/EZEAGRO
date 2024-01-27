package com.niet.signodes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.niet.signodes.entity.User;
import com.niet.signodes.repo.UserRepository;
@Controller
public class COntroller {
	@Autowired
	private UserRepository repo3;

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @PostMapping("/contact")
    public String submitContactForm(User contactDetails) {
    	repo3.save(contactDetails);
        // Process the submitted contact details here (e.g., save to a database)
        // You can access the form fields via the contactDetails object

        // Redirect to a thank you page or any appropriate page
        return "redirect:/contact";}

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/icons")
    public String icons() {
        return "icons";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/single")
    public String single() {
        return "single";
    }

    @GetMapping("/typography")
    public String typography() {
        return "typography";
    }
}
