package guanabaraAulas;

import java.util.Scanner;

public class EstruturasCondicionais1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CTRL + SHIFT + O - IMPORTA SCANNER.
		Scanner teclado = new Scanner(System.in);

		
		// CONDIÇÃO SIMPLES - CÁLCULO DE MÉDIA
		
		System.out.print("Informe a nota 1: ");
		float n1 = teclado.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		float n2 = teclado.nextFloat();
		
		float m = (n1 + n2)/2;
		
		System.out.println("Sua média foi: " + m);
		
		if (m > 9) {
			System.out.println("Parabéns!");
		}
		
		
		
		// CONDIÇÃO COMPOSTA - CALCULA A IDADE E MOSTRA SE É DE MAIOR/MENOR
		
		System.out.println("Em que ano você nasceu? ");
		int nasc = teclado.nextInt();
		int i = 2022 - nasc;

		System.out.println("Sua idade e: " + i);

		if (i > 18) {
		System.out.println("Maior de Idade");
		} else {
		System.out.println("Menor de Idade");
		}

		
		
		
		
		
		
		teclado.close();


		
		
	}

}
