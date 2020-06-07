import java.util.Scanner;

public class Exercicio03 {

	/**
	 * Exercicio 03 - Recursividade - v1.0
	 * 
	 * (2,0pts) - Temos vários coelhos e cada coelho tem duas orelhas grandes e
	 * flexíveis. Queremos calcular o número total de orelhas em todos os coelhos de
	 * forma recursiva (sem loops ou multiplicação). Criar uma função recursiva que
	 * receba um número N representando o número de coelhos e retorne a número total
	 * de orelhas.
	 * 
	 * Exemplos: orelhasCoelho(0) → 0 orelhasCoelho(1) → 2 orelhasCoelho(2) → 4
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Coelhos: ");
		System.out.print("Orelhas: " + orelhasCoelho(in.nextInt()));

		in.close();
	}

	static int orelhasCoelho(int n) {
		if (n > 0) {
			n--;
			return 2 + orelhasCoelho(n); // Incrementa duas orelhas na memória pra cada recursão de N
		} else {
			return 0;
		}
	}
}
