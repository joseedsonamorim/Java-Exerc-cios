/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao6;

/**
 *
 * @author joseedson
 */
public class UsaEstoque {
    
    public static void main(String[] args) {
        
        Estoque estoque1 = new Estoque();
        estoque1.nome = "Impressora Jato de Tinta"; 
        estoque1.qtdAtual = 13;
        estoque1.qtdMinima = 6;
        
        Estoque estoque2 = new Estoque();
        estoque2.nome = "Monitor LCD 17 polegadas"; 
        estoque2.qtdAtual = 11;
        estoque2.qtdMinima = 13;
        
        Estoque estoque3 = new Estoque();
        estoque3.nome = "Mouse Ótico"; 
        estoque3.qtdAtual = 6;
        estoque3.qtdMinima = 2;
        
        estoque1.darBaixa(5);
        //System.out.println("Nome:" + estoque1.nome + "Quantidade atual: "+ estoque1.qtdAtual + "Quantidade mínima: "+ estoque1.qtdMinima);
        
        estoque2.repor(7);
        //System.out.println("Nome:" + estoque2.nome + "Quantidade atual: "+ estoque2.qtdAtual + "Quantidade mínima: "+ estoque2.qtdMinima);

        estoque3.darBaixa(4);
        //System.out.println("Nome:" + estoque3.nome + "Quantidade atual: "+ estoque3.qtdAtual + "Quantidade mínima: "+ estoque3.qtdMinima);
        
                
        estoque1.mostrar();
        System.out.println("precisa repor?:" +estoque1.precisaRepor() + "\n");
        
        estoque2.mostrar();
        System.out.println("precisa repor?:" +estoque2.precisaRepor() + "\n");
        
        estoque3.mostrar();
        System.out.println("precisa repor?:" + estoque3.precisaRepor() + "\n");

        
    }
}
