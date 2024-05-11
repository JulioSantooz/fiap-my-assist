package br.com.julio.fiap.myassist.models;

import java.time.LocalDateTime;

public class Servico {

    String descricao;
    double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
