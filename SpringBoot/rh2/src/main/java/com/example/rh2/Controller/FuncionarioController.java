package com.example.rh2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.rh2.Repository.FuncionarioRepository;
import com.example.rh2.Model.Funcionario;

@Controller
public class FuncionarioController {
    
    @Autowired
    FuncionarioRepository fr;

    @GetMapping("/funcionario")
    public String abirFuncionario() {
        return "funcionario/funcionario";
    }

    @PostMapping("/funcionario")
    public String gravarFuncionario(Funcionario funcionario) {
        fr.save(funcionario);
        return "redirect:/funcionario";
    }
}
