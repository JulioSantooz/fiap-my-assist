package br.com.julio.fiap.myassist.fiapmyassist.service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OsUpdateDTO {
    private LocalDate previsaoEntrega;
    private String statusConcerto;
    private String observacoes;
}
