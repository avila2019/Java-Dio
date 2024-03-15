// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();

        B = sc.nextDouble();

        // TODO: Complete os espaços em branco com uma possível solução para o desafio

        media = ((3.5 * A) + (7.5 * B)) / 11;

        System.out.printf("MEDIA = %.5f", +media);

        System.out.println();

    }

}

/*Desafio
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.
Saída
Caucule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço
em branco antes e depois da igualdade. utilize variáveis de dupla precisão(double) e com todos os problema.

Exemplos de entrada 5.0 e 7.1     exemplos de saída MEDIA = 6.43182 */
