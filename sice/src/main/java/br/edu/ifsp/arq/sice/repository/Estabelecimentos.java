package br.edu.ifsp.arq.sice.repository;

import org.springframework.stereotype.Repository;

import br.edu.ifsp.arq.sice.model.Estabelecimento;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Estabelecimentos extends JpaRepository<Estabelecimento, Long>{

}
