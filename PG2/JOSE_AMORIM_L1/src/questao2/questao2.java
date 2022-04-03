/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author joseedson
 */

import java.util.Scanner;

public class questao2 {
    
    //Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
    //qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
    //numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
    //abaixo:
  
    public static void main(String[] args) {
        
        int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("De qual número você quer ver a tabuada?: ");
        int n = sc.nextInt();
        
        if (n <= 10) {
            
                for (a = 1; a <= 10; ++a){
		b = n * a;
                System.out.println(n + "x" + a + " = " + b);
            }      
        } else {
            
            System.out.println("Ainda estou aprendendo a fazer tabuada maior de 10... desculpe!");
        }
    }
}
