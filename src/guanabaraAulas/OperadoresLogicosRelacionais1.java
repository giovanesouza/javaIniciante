package guanabaraAulas;

public class OperadoresLogicosRelacionais1 {

	public static void main(String[] args) {

// OPERADOR TERNÁRIO
// EXEMPLO 01:

		int n1, n2, r;
		n1 = 4;
		n2 = 8;
		r = (n1 > n2) ? 0 : 1;

		System.out.println(r);

// EXEMPLO 02:		

		int nota1, nota2, resultado;
		nota1 = 14;
		nota2 = 8;
		resultado = (nota1 > nota2) ? nota1 + nota2 : nota1 - nota2;

		System.out.println(resultado);

		// OPERADORES LÓGICOS

		int x, y, z;
		x = 4;
		y = 7;
		z = 12;

		boolean res;
		res = (x < y && y < z) ? true : false;
		System.out.println(res);

	}

}
