/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenar;

/**
 *
 * @author eduro
 */
public class OrdenacaoInsercao {
    public static long Ordenacao(int[] vetor) {
        long TempoInicial = System.nanoTime();
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        long TempoFinal = System.nanoTime();
        return TempoFinal - TempoInicial;
    }
}
