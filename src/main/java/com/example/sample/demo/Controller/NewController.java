package com.example.sample.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sample.demo.DateTimeForm;
import com.example.sample.demo.Service.NewService;


@Controller
public class NewController {
    @GetMapping("/new_entities")
    public String show(Model model)
    {
        model.addAttribute("new_entities");
        return "new_entities";
    }
    @Autowired
    private NewService newService;
    @PostMapping("/save")
    public String saveDateTime(DateTimeForm dateTimeForm)
    {
newService.saveDateTime(dateTimeForm);        
return "new_entities";
    }

}
