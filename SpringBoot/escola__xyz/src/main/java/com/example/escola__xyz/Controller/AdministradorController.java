package com.example.escola__xyz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.escola__xyz.Model.Administrador;
import com.example.escola__xyz.Repository.AdministradorRepository;
import com.example.escola__xyz.Repository.VerificaCadastroAdmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdministradorController {
    
    @Autowired // Permite a transformação dde um objeto Java em entidade de BD (Cada Obj. = Linha do BD)
    AdministradorRepository ar;

    @Autowired
    VerificaCadastroAdmRepository vcar;

    // Veriicar acesso/cadastro
    boolean acessoAdm = false;

    @GetMapping("/cadastrar-adm")
    public String acessoCadastroAdmPage() {
        return "cadastro/cadastro-adm";
    }
    
    @PostMapping("cadastrar-adm")
    public ModelAndView cadastrarAdmBD(Administrador adm, RedirectAttributes attributes) {
        boolean verificarCpf = vcar.existsById(adm.getCpf()); // Se existir = true | Se não = false
        ModelAndView mv = new ModelAndView("redirect:/login-adm");
        if(verificarCpf){ // Pega as informações do formúlario e cria um novo objeto da classe Adm
            ar.save(adm); // Salva no BD
            String mensagem = "Cadastro Realizado com Sucesso!";
            System.out.println(mensagem);
            attributes.addFlashAttribute("msg", mensagem);
            attributes.addFlashAttribute("classe", "verde");
        }else{
            String mensagem = "Cadastro não Permitido";
            System.out.println(mensagem);
            attributes.addFlashAttribute("msg", mensagem);
            attributes.addFlashAttribute("classe", "vermelho");

        }

        return mv;
    }
    
    @GetMapping("/login-adm")
    public String acessoLoginPageAdm() {
        return "login/login-adm";
    }
    
    @PostMapping("/acesso-adm")
    public ModelAndView acessoAdm(@RequestParam String cpf, @RequestParam String senha, RedirectAttributes attributes) {
        
        ModelAndView mv = new ModelAndView("redirect:/interna-adm");
        boolean verificaCpf = ar.existsById(cpf);
        boolean verificaSenha = ar.findByCpf(cpf).getSenha().equals(senha);

        if(verificaCpf && verificaSenha){
            acessoAdm = true;
        }else{
            String mensagem = "CPF ou Senha Incorretos";
            System.out.println(mensagem);
            attributes.addFlashAttribute("msg", mensagem);
            attributes.addFlashAttribute("classe", "vermelho");
            mv.setViewName("redirect:/login-adm");
        }

        return mv;
    }
    
    @GetMapping("/interna-adm")
    public ModelAndView acessoInternaPageAdm(RedirectAttributes attributes) {
        String vaiPara = "";
        if (acessoAdm){
            vaiPara = "/interna/interna-adm";
        }else{
            String mensagem = "Acesso não Permitido";
            System.out.println(mensagem);
            attributes.addFlashAttribute("msg", mensagem);
            attributes.addFlashAttribute("classe", "vermelho");
            vaiPara = "redirect:/login-adm";
        }
        ModelAndView mv = new ModelAndView(vaiPara);
        return mv;
    }
    
}