import java.util.Scanner;

public class Exercicio04 {

	/**
	 * Exercicio 04 - Recursividade - v1.0
	 * 
	 * (2,0pts) Dada uma string, criar uma função recursiva (sem laços) que compute
	 * o número de caracteres ’x’ na string.
	 * 
	 * Exemplos: contarX("xxhixx") → 4 contarX("xhixhix") → 3 contarX("hi") → 0
	 * 
	 * Dica: utilize os métodos length() e substring() da classe String.
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Texto: ");
		System.out.print("X's: " + contarX(in.nextLine()));

		in.close();
	}

	static int contarX(String texto) {
		if (texto.length() <= 0 || texto.isEmpty())
			return 0;
		else if (texto.substring(0, 1).toLowerCase().equals("x"))
			return 1 + contarX(texto.substring(1));
		else
			return contarX(texto.substring(1));
	}
}
