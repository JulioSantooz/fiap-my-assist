package br.com.julio.fiap.myassist.fiapmyassist.login.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByLoginAndSenha(String login, String senha);
}
