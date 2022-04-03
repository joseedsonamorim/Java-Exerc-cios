/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;

/**
 *
 * @author joseedson
 */
public class questao3 {
    
    //Desenvolver um programa que efetue a soma de todos os números
    //ímpares que são múltiplos de três e que se encontram no conjunto dos
    //números de 1 até 500.
    public static void main(String[] args) {
       
     int soma = 0;
     
     for (int i = 1; i < 500; i++) {
     if (i % 3 == 0 && i % 5 == 0) {
        soma += i;
        System.out.println(i);
     }
    }
  }
}
