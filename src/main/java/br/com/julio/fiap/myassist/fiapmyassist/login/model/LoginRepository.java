package br.com.julio.fiap.myassist.fiapmyassist.login.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    Optional<LoginEntity> findByLoginAndSenha(String login, String senha);
}
