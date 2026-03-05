package com.example.rh2.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.rh2.Model.Funcionario;
import java.util.List;



public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
    
    Funcionario findById(long id);

    Funcionario findByNome(String nome);

    @Query(value = "select u from Funcionario u where u.nome like %?1%")
    List<Funcionario> findByLetras(String letras);
}
