package br.com.julio.fiap.myassist.fiapmyassist.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OsDTO {

    @NotBlank
    private String proprietario;

    @NotBlank
    private String tipoEquipamento;

    @NotNull
    private LocalDate entradaLab;

    @NotBlank
    private String defeito;

    private LocalDate previsaoEntrega;

    @NotBlank
    private String statusConcerto;

    private String observacoes;

}
