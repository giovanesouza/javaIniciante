package guanabaraAulas;

import java.util.Scanner;

public class EstruturasRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DO WHILE (FAÇA ENQUANTO)

		// EXEMPLO 1: IMPRIME A PALAVRA X VEZES NA TELA.

		int cc = 0;

		do {

			System.out.println("Cambalhota");

			cc++;
		} while (cc < 4);

		
		
		// EXEMPLO 02: PEGA UM NÚMERO E SOMA-O ENQUANTO O USUÁRIO DIGITAR S PARA
		// CONTINUAR - NO FINAL DA EXECUÇÃO, IMPRIME A SOMA.

		int n, s = 0;

		String resp;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			n = teclado.nextInt();

			s += n;

			System.out.println("Quer continuar? [S/N]");
			resp = teclado.next();

		} while (resp.equals("s")); // ENQUANTO A RESPOSTA FOR IGUAL A  “s”, EXECUTA o DO.

		System.out.println("A soma dos valores é " + s);

	}

}
