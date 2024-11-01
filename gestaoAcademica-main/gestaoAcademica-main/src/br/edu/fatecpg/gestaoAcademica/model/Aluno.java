package br.edu.fatecpg.gestaoAcademica.model;

public class Aluno extends Disciplina{
	
	private Aluno nomeAluno;
	private String matricula;

	public Aluno getnomeAluno() {
	    return nomeAluno;
	}
	public void setnomeAluno(Aluno nomeAluno) {
	    this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
	    return matricula;
	}
	public void setMatricula(String matricula) {
	    this.matricula = matricula;
	}
	
	}