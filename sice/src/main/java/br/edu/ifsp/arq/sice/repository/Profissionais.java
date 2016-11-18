package br.edu.ifsp.arq.sice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifsp.arq.sice.model.Profissional;

@Repository
public interface Profissionais extends JpaRepository<Profissional, Long>{

}
