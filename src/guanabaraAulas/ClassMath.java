package guanabaraAulas;

public class ClassMath {

	public static void main(String[] args) {
		
		System.out.println(Math.PI); // Constante PI
		System.out.println(Math.pow(5,2)); // Exponenciação
		System.out.println(Math.sqrt(25)); // Raiz quadrada
		System.out.println(Math.cbrt(27)); // Raiz cubica

		
		// ARREDONDAMENTOS
		System.out.println(Math.abs(-10)); // valor absoluto 
		System.out.println(Math.floor(3.9)); // Arredonda para baixo 
		System.out.println(Math.ceil(4.5)); // Arredonda para cima 
		System.out.println(Math.round(5.6)); // Arredondamento aritmetico (com base no número decimal.
		
		
		// GERADOR DE NÚMEROS
		System.out.println(Math.random()); // Gera número randomicamente entre 0 e 1.
		
		
		// Gerando números aleatórios entre 5 e 10.
		
		double ale = Math.random();
		int n = (int) (5 + ale * (10 - 5));
		System.out.println(n);

		
	}

}
