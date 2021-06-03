package com.excoder.myhome.controller;

import com.excoder.myhome.validator.PhotoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/photo")
public class PhotoController {

    @GetMapping("/form")
    public String form(){
        return "photo/form";
    }
}
