package br.com.alura.forum.controller.form;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repositiry.TopicoRepository;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AtualizacaoTopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
        private String titulo;

        @NotNull @NotEmpty @Length(min = 10)
        private String mensagem;

		public String getTitulo() {
			return titulo;
		}

		public String getMensagem() {
			return mensagem;
		}

		public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		    Topico topico = topicoRepository.getOne(id);

		        topico.setTitulo(this.titulo);
		        topico.setMensagem(this.mensagem);

		        return topico;
		}

        
        
        
        
        
        
}