package br.com.alura.forum.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository <Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	
//	para monstar a sua propria query
//	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//    List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")(String nomeCurso);

}
