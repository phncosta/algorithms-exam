import java.util.Scanner;

public class Exercicio06 {
    
	/*
	 * 			INTEGRANTES
	 * Paulo Henrique Nogueira Costa | 
	 * Pedro Rafael Santos Gomes     |
	 * Sillas Cavalcante Lopes Pinto |
	 * 
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * 6. (2,0) A multiplicação Russa consiste em:
     * 
     * a) Escrever os números A e B, que se deseja multiplicar na parte superior das colunas;
     * 
     * b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, escrever 
     * os resultados da coluna A;
     * 
     * c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, escrever os 
     * resultados sucessivos na coluna B;
     * 
     * d) Somar todos os números da coluna B que estejam ao lado de um número ímpar da coluna A
     * 
     * Exemplo: 27 x 82 = 2214
     * 
     * | A  | B    | Parcelas | 
     * | 27 | 82   | 82       |
     * | 13 | 164  | 164      |
     * | 6  | 328  | -        |
     * | 3  | 656  | 656      |
     * | 1  | 1312 | 1312     |
     * 
     * Soma:         2214
     * 
     * Criar uma função recursiva que permita fazer à multiplicação russa de 2 entradas.
     */
    
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("A = ");
        int a = in.nextInt();

        System.out.print("B = ");
        int b = in.nextInt();
        
        System.out.println("A x B = " + multiplicacaoRussa(a, b));

        in.close();
    }

    static int multiplicacaoRussa(int a, int b) {
        if (a > 1 && b > 0) {
            if (a % 2 == 1) {
                return multiplicacaoRussa(a / 2, b * 2) + b;
            } else {
                return multiplicacaoRussa(a / 2, b * 2);
            }
        } else if (a == 0) {
            return a;
        } else {
            return a * b;
        }
    }
}