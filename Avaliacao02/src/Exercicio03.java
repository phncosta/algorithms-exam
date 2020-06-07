
public class Exercicio03 {

	// Exercicio 03 - Recursividade - v1.0
	public static void main(String[] args) {

		System.out.println(orelhasCoelho(2));
	}

	public static int orelhasCoelho(int n) {
		if (n > 0) {
			n--;
			return 2 + orelhasCoelho(n); // Incrementa duas orelhas na memória pra cada recursão de N
		} else {
			return 0;
		}
	}
}
