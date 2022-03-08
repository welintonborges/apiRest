package br.com.forum.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
