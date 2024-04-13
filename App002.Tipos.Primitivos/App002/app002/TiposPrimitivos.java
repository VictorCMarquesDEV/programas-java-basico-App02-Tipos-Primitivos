package app002;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite o nome do aluno: ");
			String nome = teclado.nextLine();
			System.out.print("Digite a nota do aluno: ");
			float nota = teclado.nextFloat();
			System.out.println("A nota de " + nome + " é " + nota);
		}
		int idade = 20;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		String ano = new String("2003");
		int nasc = Integer.parseInt(ano);
		System.out.println(nasc);
	}

}
