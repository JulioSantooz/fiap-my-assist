package br.com.julio.fiap.myassist.fiapmyassist.data.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class OsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "PROPRIETARIO")
    private String proprietario;

    @Column(name = "TIPO_EQUIPAMENTO")
    private String tipoEquipamento;

    @Column(name = "ENTRADA_LAB")
    private LocalDate entradaLab;

    @Column(name = "DEFEITO")
    private String defeito;

    @Column(name = "PREVISAO_ENTREGA")
    private LocalDate previsaoEntrega;

    @Column(name = "STATUS_CONCERTO")
    private String statusConcerto;

    @Column(name = "OBSERVACOES")
    private String observacoes;

}
