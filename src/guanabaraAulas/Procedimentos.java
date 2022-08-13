package guanabaraAulas;

public class Procedimentos {

	// EXEMPLO: PROCEDIMENTO DE SOMA

	// DECLARAÇÃO

	static void soma(int a, int b) {

		int s = a + b;
		System.out.print("A soma é " + s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PROCEDIMENTOS: NÃO RETORNAM VALOR (UTILIZA A PALAVRA VOID).
		// DEVEM SER CRIADOS DENTRO DA PUBLIC CASS (ACIMA)
		// NECESSÁRIO INSERIR A PALAVRA STATIC ANTES DO VOID.
		// A CHAMADA DEVE SER FEITA AQUI NO MÉTODO PRINCIPAL

			System.out.println("Começou o programa.");
		
		// CHAMADA
		soma(5, 2);

	}

}
