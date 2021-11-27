package br.com.namikoka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponse {
	
	private Long id;
	
	private String nome;

	private String email;

	private String telefone;
	
	private String curso;
	
	public PessoaResponse build(Pessoa pessoa) {
		return PessoaResponse.builder()
				.id(pessoa.getId())
                .nome(pessoa.getNome())
                .email(pessoa.getEmail())
                .telefone(pessoa.getTelefone())
                .curso(pessoa.getCurso())
                .build();
	}
	
	
}
