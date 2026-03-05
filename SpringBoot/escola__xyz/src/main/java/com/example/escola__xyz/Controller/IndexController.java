package com.example.escola__xyz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



// Anotação de classe controle (interação entre view e model)
@Controller
public class IndexController {
    @GetMapping("/home")
    public ModelAndView acessoHomePage() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("")
    public String acessoHomePage2() {
        return "index";
    }
    
    
    
    // @GetMapping("/sobre")
    // public ModelAndView acessoSobre() {
    //     ModelAndView mv = new ModelAndView("sobre");
    //     return mv;
    // }

    // @GetMapping("/contato")
    // public ModelAndView acessoContato() {
    //     ModelAndView mv = new ModelAndView("contato");
    //     return mv;
    // }
    
}
