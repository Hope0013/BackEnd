package com.example.escola__xyz.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.escola__xyz.Model.Administrador;

public interface AdministradorRepository extends CrudRepository <Administrador, String>{

    Administrador findByCpf(String cpf); // Busca pelo cpf - P.K.
    
}
