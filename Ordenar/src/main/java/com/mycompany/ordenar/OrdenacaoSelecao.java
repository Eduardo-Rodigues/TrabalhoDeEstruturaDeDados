/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenar;

/**
 *
 * @author eduro
 */
class OrdenacaoSelecao {
    public static long Ordenacao(int[] vetor) {
        long TempoInicial = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int Index = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[Index]) {
                    Index = j;
                }
            }
            int temp = vetor[Index];
            vetor[Index] = vetor[i];
            vetor[i] = temp;
        }
        long TempoFinal = System.nanoTime();
        return TempoFinal - TempoInicial;
    }
}