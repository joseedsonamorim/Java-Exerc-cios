/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teeste;

/**
 *
 * @author joseedson
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }
    
    double juros = 5.5;
    
    public void renderJuros (double saldo){
    
        this.debitar(saldo * juros);
       
    }

}