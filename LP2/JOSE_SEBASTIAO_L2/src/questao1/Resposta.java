package questao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class Resposta {
    
    public static void main(String[] args) {
           
        Square square1 = new Square();
        square1.makeVisible();
        square1.changeSize(300);
        square1.changeColor("green");
        System.out.println(square1.toString()); 
        
        Circle circle1 = new Circle(); 
        circle1.makeVisible();
        circle1.changeColor("white");
        circle1.moveHorizontal(80);
        circle1.moveVertical(30);
        circle1.changeSize(90);
        System.out.println(circle1.toString());
        
        //Aqui irei fazer uma repetição de quadrados, mas poderia alterar o código do quadrado para adicionar largura e altura para poder criar um retangulo e poupar linhas de código
        
        //Como só pode mudar o código do main resposta, vou deixar o quadrado gigante e mover para o topo do canvas
        
        Square square2 = new Square();
        square2.makeVisible();
        square2.changeSize(200);
        square2.moveHorizontal(50);
        square2.moveVertical(200);
        square2.changeColor("white");
        System.out.println(square2.toString());
        
        Square square3 = new Square();
        square3.makeVisible();
        square3.changeSize(300);
        square3.moveVertical(-270);
        square3.changeColor("yellow");
        System.out.println(square3.toString());
        
        Square square4 = new Square();
        square4.makeVisible();
        square4.changeSize(300);
        square4.moveHorizontal(270);
        square4.changeColor("yellow");
        System.out.println(square4.toString());
        
        Square square5 = new Square();
        square5.makeVisible();
        square5.changeSize(300);
        square5.moveHorizontal(-270);
        square5.changeColor("yellow");
        System.out.println(square5.toString());
        
        Square square6 = new Square();
        square6.makeVisible();
        square6.changeSize(300);
        square6.moveVertical(270);
        square6.changeColor("yellow");
        System.out.println(square6.toString());

       
    }
    
}
