package ru.nikulin.service.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.nikulin.service.repositories.UsersRepository;

@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/hi")
    public String getHi(ModelMap model){
        model.addAttribute("user","Tema");
        return "hello";
    }
    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }

}
