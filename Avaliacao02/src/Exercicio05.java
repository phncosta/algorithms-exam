import java.util.Scanner;

public class Exercicio05 {

	/*
	 * 			INTEGRANTES
	 * Paulo Henrique Nogueira Costa | 
	 * Pedro Rafael Santos Gomes     |
	 * Sillas Cavalcante Lopes Pinto |
	 * 
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * 5. (2,0) Temos triângulos feito de blocos. A linha superior tem 1 bloco, a
	 * próxima linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e assim por
	 * diante. Criar uma função recursiva que calcule (sem loops ou multiplicação) o
	 * número total de blocos em um triângulo com o número especificado de linhas.
	 * 
	 * Exemplos: triangulo(0) → 0 triangulo(1) → 1 triangulo(2) → 3
	 */

	static int contador = 0, numBlocos = 0, ultimaLinha = 0;

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Número de linhas: ");
		int blocos = triangulo(in.nextInt());

		System.out.printf("Número de blocos no triângulo: %d%n", blocos);

		in.close();
	}

	static int triangulo(int numLinhas) {
		if (contador < numLinhas) {
			ultimaLinha = contador + 1;
			numBlocos += ultimaLinha;
			contador += 1;
			triangulo(numLinhas);
		}
		return numBlocos;
	}
}
