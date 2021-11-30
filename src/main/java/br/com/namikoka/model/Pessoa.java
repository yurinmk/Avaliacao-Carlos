package br.com.namikoka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String email;

	private String telefone;
	
	private String curso;
	
	public Pessoa build(PessoaResponse pessoaResponse) {
		return Pessoa.builder()
				.id(pessoaResponse.getId())
                .nome(pessoaResponse.getNome())
                .email(pessoaResponse.getEmail())
                .telefone(pessoaResponse.getTelefone())
                .curso(pessoaResponse.getCurso())
                .build();
	}
	

}
