package br.edu.fateczl.aulafateczlspring.services;

import org.springframework.stereotype.Service;

import br.edu.fateczl.aulafateczlspring.repository.AlunoRepository;
import entity.Aluno;

@Service
public record AlunoServices(AlunoRepository alunoRepository) {
	
	public Aluno salvar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
}
