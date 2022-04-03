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
	
        public boolean debitar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
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

