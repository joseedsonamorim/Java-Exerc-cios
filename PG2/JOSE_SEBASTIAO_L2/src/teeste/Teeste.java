/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teeste;

/**
 *
 * @author joseedson
 */
public class Teeste {

public static void main(String[] args) {

	Conta ct1 = new Conta(123456, 2500);

	System.out.println("DADOS DA CONTA");
	System.out.println("Número da Conta: " + ct1.getNumero());
	System.out.println("Saldo da Conta Antes de creditar: " + ct1.getSaldo());
	ct1.creditar(100);
	System.out.println("Saldo da Conta: após creditar " + ct1.getSaldo());
	ct1.debitar(50);
	System.out.println("Saldo da Conta: após debitar " + ct1.getSaldo());
        
        Conta ct2 = new ContaPoupanca (123, 2500);
        System.out.println("DADOS DA CONTA");
	System.out.println("Número da Conta: " + ct2.getNumero());
	System.out.println("Saldo da Conta Antes de creditar: " + ct2.getSaldo());
	ct2.creditar(100);
	System.out.println("Saldo da Conta: após creditar " + ct2.getSaldo());
	ct2.debitar(50);
	System.out.println("Saldo da Conta: após debitar " + ct2.getSaldo());

    }   
}
