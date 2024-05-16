package br.com.julio.fiap.myassist.fiapmyassist.data.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "usuario")
    private String login;

    @Column(name = "senha")
    private String senha;

}
