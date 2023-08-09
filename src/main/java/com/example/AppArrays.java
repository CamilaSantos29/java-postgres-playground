package com.example;

import java.util.Arrays;

public class AppArrays {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        double vetor [] = {10, 20, 30};
        System.out.println(Arrays.toString(vetor));

        System.out.println("Valor da posicão 0:" + vetor [0]);
        System.out.println("Valor da posicão 1:" + vetor [1]);
        System.out.println("Valor da posicão 2:" + vetor [2]);

        int c = 10;
        double d = c;
        System.out.println(d);

        int vetor3[] = new int[4];
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;

        System.out.println(Arrays.toString(vetor3));

        double matriz [] [] = {{1,2,3}, {4,5,6} };
        matriz[0] = new double [] {9, 8, 9};

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        System.out.println();

        int vetor4[] = new int[5];
        for (int i = 0; i < vetor4.length; i++) {
            vetor4[i] = 100 * (i+1);

        System.out.println(Arrays.toString(vetor4));    
        System.out.println();

        double matriz1 [] [] = new double [2] [3];
        for (int e = 0; e < matriz1.length; e++){
            for (int j = 0; j < matriz1 [e].length; j++){
                matriz1 [e] [j] = e * matriz1[e].length + j;

            }

        }
        for (int e = 0; e < matriz1.length; e++){
            for (int j = 0; j < matriz1 [e].length; j++){
                matriz1 [e] [j] = e * matriz1[e].length + j;

                System.out.print(matriz[e][j] + " ");
        }
        System.err.println();
    }

    
}
    
    }
}