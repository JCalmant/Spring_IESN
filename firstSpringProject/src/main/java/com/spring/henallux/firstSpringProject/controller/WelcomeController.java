package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.dao.MagicKeyDAO;
import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class WelcomeController {

    private MagicKeyDAO dao;

    @Autowired
    public WelcomeController(MagicKeyDAO dao)
    {
        this.dao = dao;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model) {
        model.addAttribute("title","Welcome page");
        model.addAttribute("magicKeyForm", new MagicKeyForm());
        return "integrated:welcome";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String getFormData(@ModelAttribute(value="magicKeyForm") MagicKeyForm form) {
        if(dao.getMagicKeys().contains(form.getMagicKey()))
        {
            return "redirect:/inscription";
        }
        else return "integrated:keyError";
    }
}

