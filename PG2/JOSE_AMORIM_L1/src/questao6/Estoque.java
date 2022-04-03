/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao6;

/**
 *
 * @author joseedson
 */
public class Estoque {
    
    String nome;
    int qtdAtual;
    int qtdMinima;
    //int qtd = ; //Não tinha no pdf na parte de tributos, mas tinha no final, então adicionei.
   
  
    public Estoque (String nome, int qtdAtual, int qtdMinima, int qtd) {
    
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        //this.qtd = qtd;
        
        if( this.qtdMinima < 0)  {
         throw new IllegalArgumentException("Epá, pode não!");
     } else if(this.qtdAtual < 0) {
         throw new IllegalArgumentException("Epá, pode não!");
     }
    }
    
    public Estoque (){
        
        
    }
    
    
    public void mudarNome (String nome){
    
    }
    
    public void mudarQtdMinima (int qtdminima){
    
    }
    
    public void repor (int qtd){
    
        this.qtdAtual = qtdAtual + qtd;
    }
    
    public void darBaixa (int qtd){
    
        this.qtdAtual = qtdAtual - qtd; 
    }
    
    public void mostrar(){
    
        System.out.println("Produto: " + nome + "\n" + "Quantidade mínima: " + qtdAtual + "\n" + "Quantidade atual: " + qtdMinima);
    }
    
    public boolean precisaRepor(){
    
        if (qtdAtual <= qtdMinima) {
            return true;
        }
        else{
        
            return false;
        }
    }
   
}
