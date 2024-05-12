package br.com.julio.fiap.myassist.fiapmyassist.login.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {

    @NotBlank()
    private String login;

    @NotBlank()
    private String senha;
}
