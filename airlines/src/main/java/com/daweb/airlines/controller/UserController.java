package com.daweb.airlines.controller;

import com.daweb.airlines.model.User;
import com.daweb.airlines.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/addUser")
    public ModelAndView createUser() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add-user");
        mav.addObject("user", new User());
        return mav;
    }
    @PostMapping("/addUser")
    public ModelAndView createUser(@Valid User user, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()) {
            mav.setViewName("add-user");
            mav.addObject("user", user);
            return mav;
        }
        userService.createUser(user);
        mav.addObject("allUsers", userService.getAllUser());
        mav.setViewName("index");
        return mav;
    }

}
