package com.examples.spring.web.mvc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.examples.spring.web.mvc.model.User;


@Controller
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public String viewRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@Valid User user, BindingResult result, Model model, HttpSession session) {
 
        if (result.hasErrors()) {
            return "register";
        }
        else {
        	session.setAttribute("username", user.getUserName());
        	session.setAttribute("password", user.getPassword());
        	return "registerSuccess";
        }
    }
	
}
