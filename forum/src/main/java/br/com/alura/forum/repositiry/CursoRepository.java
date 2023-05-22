package br.com.alura.forum.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository <Curso, Long> {

	Curso findByNome(String nome);

	
	


}
