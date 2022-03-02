package br.com.forum.forum.repository;

import br.com.forum.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository  extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);

}
