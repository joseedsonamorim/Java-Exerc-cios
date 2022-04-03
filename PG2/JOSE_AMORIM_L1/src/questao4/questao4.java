/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

/**
 *
 * @author joseedson
 */

import java.util.Scanner;

public class questao4 {
        
// logic to sort the elements
    public static void organizar(double array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    converter(i, k, array);
                }
            }
        }
        print(array);
    }

    private static void converter(int i, int j, double[] array) {

        double temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void print(double[] input) {

        //System.out.println(""+ Arrays.toString(input));

        System.out.println("Menor altura do grupo: "+ input[0]);

        System.out.println("Maior altura do grupo: "+ input[input.length-1]);
    }

    public static void main(String[] args) {
        double[] alturas = { 1.60, 1.80, 1.75, 1.95, 1.50, 1.68, 1.78, 1.48, 1.50, 1.30, 1.65, 1.45, 1.57, 1.85, 1.68};
        organizar(alturas);
    }

} 
