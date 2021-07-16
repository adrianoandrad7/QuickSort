/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
import java.util.Arrays;

public class QuickSort {
//teste
    public static void main(String[] args) {

        int[] vetor = {5, 9, 7, 4, 6, 1, 2, 3, 10, -1,};

        System.out.println(Arrays.toString(vetor));
        quickSort(vetor, 0, vetor.length - 1);
        System.out.println(Arrays.toString(vetor));

    }
//implementaçao quick

    private static void quickSort(int[] vetor, int esq, int dir) {
        if (esq < dir) {
            int posicaoPivo = separar(vetor, esq, dir);
            quickSort(vetor, esq, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, dir);

        }
    }

    private static int separar(int[] vetor, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = vetor[esq];

        while (i <= j) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (vetor[j] > pivo) {
                j--;

            } else if (i <= j) {
                trocar(vetor, i, j);
                i++;
                j--;

            }

        }
        trocar(vetor, esq, j);
        return j;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;

    }

}
