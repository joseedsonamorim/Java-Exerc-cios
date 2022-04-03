/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teeste;

/**
 *
 * @author joseedson
 */
public class Conta {

    private double saldo;
    private int numero;

    	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
        public void debitar(double valor) {
            
		if(valor > this.saldo ){
                    
                    System.out.println("Saque invaldio.");
                    
        }else {
                    
                    System.out.println("Saque Efetuado.");
                    this.saldo = this.saldo -= valor;
                    
            }
	}
        
        public void creditar(double valor) {
		saldo += valor;
	}
        
        public double getSaldo() {
		return saldo;
	}
        
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}	
} 

