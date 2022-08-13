package guanabaraAulas;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VETORES

		/*
		 * DECLARAÇÃO: int n[] = new int[4]; INSERINDO VALORES: n[0] = 3; n[1] = 5; n[2]
		 * = 8; n[3] = 2;
		 * 
		 * OUTRA FORMA DE DECLARAR (quando já sabe quais serão os valores): Inserir os
		 * valores dentro do bloco { }. int n[] = {3, 5, 8, 2};
		 * 
		 * 
		 * 
		 */

	
		 // APLICAÇÃO 1: EXIBINDO VALORES
		 
		  
		 int n[] = { 3, 5, 8, 2 };
		  
		 for (int c = 0; c <= 5; c++) { 
		  
		 System.out.println("Na posição " + c + " temos o valor " + n[c]); // MOSTRA OS VALORES: A POSIÇÃO É DADA ENTRE COLCHETES
		  
		 }
		  
		  
		  
		  // APLICAÇÃO 2: IDENTIFICANDO A QUANTIDADE DE DIAS CONFORME O MÊS -  UTILIZANDO O LENGTH
		  
		  
		  String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
		  "Set", "Out", "Nov", "Dez"}; int dias[] = {31, 28, 31, 30, 31, 30, 31, 31,
		  30, 31, 30, 31};
		  
		  for (int i = 0; i < mes.length; i++) { System.out.println(mes[i] + " tem " +
		  dias[i] + " dias."); }
		  
		  
		  
		  // ForEach (PARA CADA ELEMENTO)
		  
		  int num[] = { 3, 5, 1, 8, 4 };
		  
		  Arrays.sort(num); // COLOCA O VETOR EM ORDEM (CRESCENTE). É NECESSÁRIO
		  // IMPORTAR A CLASSE ARRAYS DA  BIBLIOTECA JAVA.UTIL.
		  
		  for (int valor : num) { System.out.print(valor + " "); }
		  
	

		// BUSCANDO UM VALOR DO ARRAY - UTILIZA A MESMA CLASSE ACIMA (ARRAYS)

		int vet[] = { 3, 7, 6, 1, 9, 4, 2 };
		
		for (int v : vet) {
			System.out.println(v);
		}

		System.out.println("");

		int p = Arrays.binarySearch(vet, 1); // VET = VARIÁVEL QUE DESEJA FAZER A BUSCA, 1 = VALOR QUE ESTÁ SENDO PROCURADO.

		System.out.println("Encontrei o valor na posição " + p);

		
		
		
		// PREENCHIMENTO AUTOMÁTICO DE VETOR - Arrays.fill(nomeVariávelArray, ValorQueSeráInserido); 
		
		// EXEMPLO: PREENCHENDO TODOS OS INDICES DE UM ARRAY COM O VALOR 0. NECESSÁRIO UTILIZAR A CLASSE (ARRAYS).
		
		
		int v[] = new int[20];
		Arrays.fill(v, 0);
		for (int valor: v) {
		System.out.println(valor + " ");
		}

		
		
		
		
		
	}

}
