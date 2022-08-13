package guanabaraAulas;

import java.util.Scanner;

public class EstruturasCondicionais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// PROGRAMA QUE INFORMA SE O VOTO É OBRIGATÓRIO, OPCIONAL OU NÃO VOTA.

		System.out.print("Em que ano você nasceu? ");
		int nasc = teclado.nextInt();

		int i = 2022 - nasc;

		System.out.println("Sua idade: " + i + " anos.");

		if (i < 16) {
			System.out.println("Você ainda não pode votar.");
		} else if ((i >= 16 && i < 18) || (i > 70)) {

			System.out.println("Seu voto é opcional.");

		} else {
			System.out.println("Seu voto é obrigatório.");
		}

		// IDENTIFICA A QUANTIDADE DE PERNAS E DÁ UM NOME COM BASE NA QUANTIDADE

		System.out.print("Informe uma quantidade de pernas qualquer: ");
		int pernas = teclado.nextInt();
		String tipo;

		switch (pernas) {
		case 1:
			tipo = "Saci";
			break;

		case 2:
			tipo = "Bípede";
			break;

		case 4:
			tipo = "Quadrúpide";
			break;

		case 6, 8:
			tipo = "Aranha";
			break;

		default:
			tipo = "ET";
			break; // BREAK NO DEFAULT NÃO É OBRIGATÓRIO.
		}

		System.out.print(tipo);

	}

}
