/*
* 5. (2,0) Temos triângulos feito de blocos. A linha superior tem 1 bloco, 
* a próxima linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e 
* assim por diante. Criar uma função recursiva que calcule 
* (sem loops ou multiplicação) o número total de blocos em um triângulo 
* com o número especificado de linhas.
* Exemplos:
* triangulo(0) → 0
* triangulo(1) → 1
* triangulo(2) → 3
*/

public class Exercicio05 {
static int contador = 0;
static int nBlocos = 0;
static int ultimaLinha = 0;

public static void main(final String[] args) {
    int triangulo = triangulo(1);
    System.out.printf("  Número de blocos no triângulo: %d%n", triangulo);
}

static int triangulo(int nLinhas) {
    if (contador < nLinhas) {
        ultimaLinha = contador + 1;
        nBlocos = nBlocos + ultimaLinha;
        contador += 1;
        triangulo(nLinhas);
        }
        return nBlocos;
    }
}