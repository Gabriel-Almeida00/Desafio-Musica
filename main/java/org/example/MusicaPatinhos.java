package org.example;

import java.util.Scanner;

public class MusicaPatinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de patinhos: ");
        int numeroPatinhos = scanner.nextInt();

        if (numeroPatinhos < 0) {
            System.out.println("O número de patinhos deve ser positivo.");
            return;
        }

        for (int i = numeroPatinhos; i >= 1; i--) {
            String estrofeAtual = obterEstrofePorExtenso(i);
            String estrofeSeguinte = obterEstrofePorExtenso(i - 1);
            imprimirEstrofe(estrofeAtual, "patinhos", estrofeSeguinte);
        }

        imprimirFinalHistoria(numeroPatinhos);

        scanner.close();
    }

    private static String obterEstrofePorExtenso(int numero) {

        String[] numerosPorExtenso = {
                "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"
        };

        return numerosPorExtenso[numero];
    }

    private static void imprimirEstrofe(String quantidade, String plural, String quantidadeRestante) {
        if (quantidade.equals("Um")) {
            System.out.println(quantidade + " patinho foi passear");
        } else {
            System.out.println(quantidade + " patinhos foram passear");
        }

        System.out.println("Além das montanhas");
        System.out.println("Para brincar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");

        if (quantidadeRestante.equals("Zero")) {
            System.out.println("Mais nenhum patinho voltou de lá\n");
        } else {
            System.out.println("Mas só " + quantidadeRestante + " patinho" + (quantidadeRestante.equals("Um") ? "" : "s") + " voltaram de lá\n");
        }
    }

    private static void imprimirFinalHistoria(int numeroPatinhos) {
        System.out.println("Puxa!");
        System.out.println("A mamãe patinha");
        System.out.println("Ficou tão triste naquele dia");
        System.out.println("Aonde será que estavam seus filhotinhos?");
        System.out.println("Mas essa história vai ter um final feliz");
        System.out.println("Sabe por quê?\n");

        System.out.println("A mamãe patinha");
        System.out.println("Foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");

        System.out.println("A mamãe gritou");
        System.out.println("Quá, quá, quá, quá!");
        System.out.println("E os " + obterEstrofePorExtenso(numeroPatinhos) + " patinhos");
        System.out.println("Voltaram de lá");
    }
}
