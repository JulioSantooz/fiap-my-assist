package br.com.julio.fiap.myassist.fiapmyassist.service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

    @NotBlank()
    private String login;

    @NotBlank()
    private String senha;
}
