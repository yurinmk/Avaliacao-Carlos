package br.com.namikoka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.namikoka.model.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
