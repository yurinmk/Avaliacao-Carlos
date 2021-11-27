package br.com.namikoka.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.namikoka.model.Pessoa;
import br.com.namikoka.model.PessoaRequest;
import br.com.namikoka.model.PessoaResponse;
import br.com.namikoka.repository.PessoaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
	
	private PessoaRepository repository;
	
	public Pessoa salvar(PessoaRequest pessoaDTO) {
		return repository.save(pessoaDTO.build());
	}
	
	public List<PessoaResponse> pesquisarTodasPessoas() {
		return repository.findAll()
				.stream()
				.map(pessoa -> new PessoaResponse().build(pessoa))
				.collect(Collectors.toList());
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
	

}
