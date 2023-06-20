/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenar;

import javax.swing.JOptionPane;

/**
 *
 * @author eduro
 */
public class Ordenar {
    
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
        int[] vetorNumeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a posição " + i + ":"));
        }

        StringBuilder originalArray = new StringBuilder();
        for (int numero : vetorNumeros) {
            originalArray.append(numero).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Vetor original: " + originalArray.toString());

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha um método de ordenação:\n" +
                "1. Ordenação por Inserção\n" +
                "2. Ordenação por Seleção\n" +
                "3. Ordenação Bolha"
            )
        );

        long executionTime = 0;
        String MetodoDeOrdenacao = "";
        switch (opcao) {
            case 1:
                executionTime = OrdenacaoInsercao.Ordenacao(vetorNumeros);
                MetodoDeOrdenacao = "Ordenação por Inserção";
                break;
            case 2:
                executionTime = OrdenacaoSelecao.Ordenacao(vetorNumeros);
                MetodoDeOrdenacao = "Ordenação por Seleção";
                break;
            case 3:
                executionTime = OrdenacaoBolha.Ordenacao(vetorNumeros);
                MetodoDeOrdenacao = "Ordenação Bolha";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida.");
                System.exit(0);
        }

        StringBuilder OrdenacaoVetor = new StringBuilder();
        for (int number : vetorNumeros) {
            OrdenacaoVetor.append(number).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Vetor ordenado (" + MetodoDeOrdenacao + "): " + OrdenacaoVetor.toString());

        JOptionPane.showMessageDialog(null, "Tempo de execução do método " + MetodoDeOrdenacao + ": " +
                executionTime + " nanosegundos");
    }
    
}
