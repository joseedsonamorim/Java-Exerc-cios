/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author sidneynogueira
 */
public class Temperatura {
    
    private float atual; //valor atual da temperatura
    private float delta; //quanto que a temperatura é aumentada ou diminuída
    private float max; //valor máximo para a temperatura
    private float min; //valor mínimo para a temperatura

    public void Construtor(){
        
        this.atual = 0;
        this.delta = 5;
        this.max = 50;
        this.min = - 50;
    
    }
    
    @Override
    public String toString(){
        String s = "Temperatura{atual=" + this.atual + "," +
                " Delta = " + this.delta + "," +
                " max = " + this.max + "," +
                " min = " + this.min; 
        return s;
    }
    
    public void decrementa(){
        
        
        atual -= delta;
        
        if(atual < min)
        {
            atual = min;
        }
    }
    
    public void incrementa(){
        
        atual += delta;
        
        if(atual < max)
        {
            atual = max;
        }
    
    }
    
    public void setAtual(float valor){
        
        if (valor >= min && valor <= max) {
            
            atual = valor;
            
        }
    
    }
    
    public void setDelta(float valor){
        
        if (valor > 0) {
            
            delta = valor;
            
        }
    
    }
    
    public void setMax(float valor){
        
        if (valor > min) {
            
            max = valor;
            
        }
    
    }
    
    public void setMin(float valor){
        
        if (valor > max) {
            
            max = valor;
            
        }
    
    }
 
}
