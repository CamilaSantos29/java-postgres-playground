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

        int i = 10;
        double d = i;
        System.out.println(d);

        int vetor3[] = new int[4];
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;

        System.out.println(Arrays.toString(vetor3));
    }
    
}
///