package br.com.julio.fiap.myassist.models;

import br.com.julio.fiap.myassist.models.abstracts.Pessoa;

public class Tecnico extends Pessoa {

    public Tecnico() {

    }

    public Tecnico(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

}
