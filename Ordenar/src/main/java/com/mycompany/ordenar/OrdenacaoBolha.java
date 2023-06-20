/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenar;

/**
 *
 * @author eduro
 */
public class OrdenacaoBolha {
    public static long Ordenacao(int[] vetor) {
        long startTime = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int index = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = index;
                }
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
