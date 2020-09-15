package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.dao.UserDAO;
import com.spring.henallux.firstSpringProject.model.Hobby;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.Constants;
import com.spring.henallux.firstSpringProject.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value="/inscription")
@SessionAttributes({Constants.CURRENT_USER})
public class InscriptionController {

    private HobbiesService hobbiesService;
    private UserDAO dao;

    @ModelAttribute(Constants.CURRENT_USER)
    public User user()
    {
        return new User();
    }


    @Autowired
    public InscriptionController(HobbiesService hobbiesService, UserDAO dao) {
        this.hobbiesService = hobbiesService;
        this.dao = dao;
    }



    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("hobbies", hobbiesService.getHobbies());
        model.addAttribute("user", new User());
        return "integrated:userInscription";
    }



    @RequestMapping(value="/userInscription", method=RequestMethod.POST)
    public String getInscriptionData(Model model,
                                     @Valid @ModelAttribute(value=Constants.CURRENT_USER) User inscriptionForm,
                                     final BindingResult errors){



        if(!errors.hasErrors()) {

            dao.save(inscriptionForm);

            //User user = new User();

            //user.setName(inscriptionForm.getName());
            //user.setAge(inscriptionForm.getAge());
            //user.setMale(inscriptionForm.getMale());
            //user.setHobby(inscriptionForm.getHobby());
            return "redirect:/gift";
        }
        else {

            model.addAttribute("hobbies", hobbiesService.getHobbies());

            String errorMessage;
            errorMessage="Sorry, the form is not valid!";
            model.addAttribute("message", errorMessage);
            return "integrated:userInscription";
        }
    }

}
