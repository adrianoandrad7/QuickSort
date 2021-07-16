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

public class QuikSort {

        



//teste
    public static void main(String[] args) {
        int[] vetor1 = {10 ,9 ,7 ,6 ,5 ,4 ,3 ,2 ,1 ,-1};
        
        quickSort(vetor1, 0, vetor1.length - 1);
        System.out.println("Decrescente:");
        System.out.println("Tempo de execução em nanosegundo: " + System.nanoTime() );
        System.out.println(Arrays.toString(vetor1));
        
        
        

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