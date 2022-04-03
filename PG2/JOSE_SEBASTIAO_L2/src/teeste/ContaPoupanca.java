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
    
     @Override
        public boolean debitar(double valor) {
            double rendimento = valor * 0.2;
            return super.debitar(rendimento);
        }
}