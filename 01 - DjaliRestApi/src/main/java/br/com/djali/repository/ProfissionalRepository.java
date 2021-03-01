package br.com.djali.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.djali.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

		Profissional findById(long id);
}
