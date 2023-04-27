// Henrique Roncon - RM99161 || Guilherme Faria - RM551374
package br.com.fiap;

import java.time.LocalDate;

public class Aluno {
	int rm, anoNascimento;
	String nome;
	
	public Aluno() {
	}

	public Aluno(int rm, int anoNascimento, String nome) {
		setRm(rm);
		setAnoNascimento(anoNascimento);
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		try {
			if (rm >= 10000 && rm <= 999999) {
				this.rm = rm;
			} else {
				throw new Exception("RM inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
        try {
            LocalDate minhaData = LocalDate.now();
            int anoAtual = minhaData.getYear();
            if (anoNascimento >= 1900 && anoNascimento <= anoAtual) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Ano de nascimento inválido!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calculaIdade(int anoAtual) {
		int idade =  anoAtual - anoNascimento;
		return idade;
	}
	
	
}


