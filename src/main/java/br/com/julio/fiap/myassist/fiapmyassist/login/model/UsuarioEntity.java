package br.com.julio.fiap.myassist.fiapmyassist.login.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "usuario")
    private String login;

    @Column(name = "senha")
    private String senha;

}
