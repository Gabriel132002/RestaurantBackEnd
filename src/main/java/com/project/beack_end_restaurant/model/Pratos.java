package com.project.beack_end_restaurant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pratos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pratos;
    
    private String nome;
    
    private String descricao;
    
    private Double preco;

    public Long getId_pratos() {
        return id_pratos;
    }

    public void setId_pratos(Long id_pratos) {
        this.id_pratos = id_pratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    

}
