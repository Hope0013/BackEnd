package com.example.rh2.Model;

import java.io.Serializable; // OK
import jakarta.persistence.Entity; // OK
import jakarta.persistence.GeneratedValue; // OK
import jakarta.persistence.GenerationType; // OK
import jakarta.persistence.Id; // OK

@Entity
public class Funcionario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String email;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
