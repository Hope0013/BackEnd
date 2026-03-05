package com.example.escola__xyz.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.escola__xyz.Model.VerificaCadastroAdm;;

public interface VerificaCadastroAdmRepository extends CrudRepository <VerificaCadastroAdm, String>{
    
    VerificaCadastroAdm findByCpf(String cpf);
}
