package guanabaraAulas;

public class Funcoes {

	// DECLARAÇÃO

	static int soma(int a, int b) {
		int s = a + b;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * DIFERENTE DO PARÂMETRO,NO LUGAR DP VPOD DEVE-SE INSERIR O TIPO PRIMITIVO DA
		 * VARIÁVEL (INT, POR EXEMPLO) - MANTÉM A PALAVRA STATICC NO INÍCIO.
		 */
		
		System.out.println("Começou o programa");
				
		
		// CHAMADA:
		int sm = soma(5, 2);
		System.out.println("A soma vale " + sm);
		//QUEM CUIDOU DA EXIBIÇÃO DO RESULTADO FOI O MÉTODO PRINCIPAL



	}

}
