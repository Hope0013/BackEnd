package com.example.teste_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class IndexController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView abrirIndex() {
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá, visitante! Nós somos todos um...";
        mv.addObject("msg", mensagem);
        return mv;
    }
    
    // Rotas de Navegação

    // Sobre
    @GetMapping("/sobre")
    public String abrirSobre() {
        return "sobre";
    }
    

    // Produtos
    
    @GetMapping("/produtos")
    public String abrirProdutos() {
        return "produtos";
    }

    // Contato
    
    @GetMapping("/contato")
    public String abrirContato() {
        return "contato";
    }

    // Enviar o formulario com o nome do usuário
    @PostMapping("/home")
    public ModelAndView postHome(@RequestParam ("nome") String nome) {
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá, " + nome + ". Nós somos todos um!";        
        mv.addObject("msg", mensagem);
        mv.addObject("nome", "");

        return mv;
    }
    

}
