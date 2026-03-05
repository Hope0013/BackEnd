package com.example.rh2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.rh2.Repository.FuncionarioRepository;

@Controller
public class IndexController {
    
    @Autowired
    FuncionarioRepository fr;

    @GetMapping("/")
    public String abrirIndex(){
        return "index";
    }
}
