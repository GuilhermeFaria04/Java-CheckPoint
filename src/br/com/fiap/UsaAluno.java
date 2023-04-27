// Henrique Roncon - RM99161 || Guilherme Faria - RM551374


package br.com.fiap;

import java.time.LocalDate;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno aluno1;
		Aluno aluno2;
		Aluno aluno3 = new Aluno(99161, 2005, "Henrique Roncon");
		Aluno aluno4 = new Aluno(551374, 2004, "Guilherme Faria");
		
		LocalDate minhaData = LocalDate.now();
		int anoAtual = minhaData.getYear();
		
		
		aluno1 = new Aluno();
		aluno2 = new Aluno();
		
		aluno1.setRm(99152);
		aluno1.setAnoNascimento(1998);
		aluno1.setNome("Alfredosvaldo");
		
		aluno2.setRm(551227);
		aluno2.setAnoNascimento(2002);
		aluno2.setNome("Rodringuito");
		
		System.out.println("--------Aluno 1--------");
		System.out.println("RM: " + aluno1.getRm());
		System.out.println("Idade: " + aluno1.calculaIdade(anoAtual));
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("-----------------------");
		
		System.out.println("\n");
		
		System.out.println("--------Aluno 2--------");
		System.out.println("RM: " + aluno2.getRm());
		System.out.println("Idade: " + aluno2.calculaIdade(anoAtual));
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("-----------------------");
		
		System.out.println("\n");
		
		System.out.println("--------Aluno 3--------");
		System.out.println("RM: " + aluno3.getRm());
		System.out.println("Idade: " + aluno3.calculaIdade(anoAtual));
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("-----------------------");
		
		System.out.println("\n");
		
		System.out.println("--------Aluno 4--------");
		System.out.println("RM: " + aluno4.getRm());
		System.out.println("Idade: " + aluno4.calculaIdade(anoAtual));
		System.out.println("Nome: " + aluno4.getNome());
		System.out.println("-----------------------");	

	}

}
