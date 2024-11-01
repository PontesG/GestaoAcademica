package br.edu.fatecpg.gestaoAcademica.model;

public class Professor extends Aluno{

		private String nmProfessor;
		private String cpf;
		private int idade;

		public String getNmProfessor() {
		    return nmProfessor;
		}
		public void setNmProfessor(String nmProfessor) {
		    this.nmProfessor = nmProfessor;
		}
		public String getCpf() {
		    return cpf;
		}
		public void setCpf(String cpf) {
		    this.cpf = cpf;
		}
		public int getIdade() {
		    return idade;
		}
		public void setIdade(int idade) {
		    this.idade = idade;
		}
	}


