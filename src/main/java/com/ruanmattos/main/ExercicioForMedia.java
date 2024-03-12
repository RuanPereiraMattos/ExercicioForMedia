package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles uma casa decimal.
 *
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *
 * Resumo: Você digitará um número para quantidade de número que o programa irá usar para fazer a média
 *
 * ENTRADA
 *
 * 3
 *
 * 6.5
 *
 * 4.3
 *
 * 6.2
 *
 * SAIDA 5.7
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioForMedia {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja verificar a média: ");

        int qtd = s.nextInt();
        double media = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 2) + " que deseja adicionar à média: ");
            media += s.nextDouble();
        }

        System.out.printf("A média dos %d números que você solicitou é: %.1f", qtd, (media / qtd));
        
    }
}
