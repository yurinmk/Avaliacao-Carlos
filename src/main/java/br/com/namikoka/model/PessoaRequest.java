package br.com.namikoka.model;

import lombok.Data;

@Data
public class PessoaRequest {
	
	private String nome;

	private String email;

	private String telefone;
	
	private String curso;
	
	
	public Pessoa build() {
		Pessoa pessoa = new Pessoa()
				.setNome(this.nome)
				.setEmail(this.email)
				.setTelefone(this.telefone)
				.setCurso(this.curso);
		
		return pessoa;
	}

}
