package br.edu.fateczl.aulafateczlspring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.aulafateczlspring.services.AlunoServices;
import entity.Aluno;

@RestController
@RequestMapping("/aluno")
public record AlunoController(AlunoServices alunoService) {
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoService.salvar(aluno);
	}
}
