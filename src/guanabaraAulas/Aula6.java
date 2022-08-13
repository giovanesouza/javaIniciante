package guanabaraAulas;

import java.util.Scanner;

public class Aula6 {

	public static void main(String[] args) {

		//TIPOS PRIMITIVOS
		
		
		// ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();

		// SAÍDA DE DADOS:
		
		System.out.printf("A nota de %s é %.2f", nome, nota);
		

	}

}
