package org.example;


import java.util.Scanner;

import java.util.Scanner;

public class MusicaPatinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de patinhos: ");
        int numeroPatinhos = scanner.nextInt();

        String[] numerosPorExtenso = {
                "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"
        };

        for (int i = numeroPatinhos; i >= 0; i--) {
            if (i > 1) {
                System.out.println(numerosPorExtenso[i] + " patinhos foram passear");
                System.out.println("Além das montanhas");
                System.out.println("Para brincar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("Mas só " + numerosPorExtenso[i - 1] + " patinho" + (i - 1 > 1 ? "s" : "") + " voltaram de lá\n");
            } else if (i == 1) {
                System.out.println(numerosPorExtenso[i] + " patinho foi passear");
                System.out.println("Além das montanhas");
                System.out.println("Para brincar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("Mas nenhum patinho voltou de lá\n");
            } else {
                System.out.println("Não havia mais patinhos passeando");
            }
        }

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
        System.out.println("E os " + numerosPorExtenso[numeroPatinhos] + " patinhos");
        System.out.println("Voltaram de lá");

        scanner.close();
    }
}


