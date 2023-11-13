package com.example.javafxproject.cliente;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private Boolean aceitaPromocao;
    
    public Cliente(Integer id, String nome, String email, String telefone, Boolean aceitaPromocao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.aceitaPromocao = aceitaPromocao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAceitaPromocao() {
        return aceitaPromocao;
    }

    public void setAceitaPromocao(Boolean aceitaPromocao) {
        this.aceitaPromocao = aceitaPromocao;
    }

    
}