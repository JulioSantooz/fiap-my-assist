package br.com.julio.fiap.myassist.fiapmyassist.data.repositorys;

import br.com.julio.fiap.myassist.fiapmyassist.data.entitys.OsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OsRepository extends JpaRepository<OsEntity, Long> {

}