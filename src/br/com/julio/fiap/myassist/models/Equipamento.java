package br.com.julio.fiap.myassist.models;

import br.com.julio.fiap.myassist.enums.TipoEquipamentoEnum;

public class Equipamento {

    String marca, modelo, numeroSerie;
    TipoEquipamentoEnum tipo;

    public Equipamento() {

    }

    public Equipamento(String marca, String modelo, String numeroSerie, TipoEquipamentoEnum tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

}
