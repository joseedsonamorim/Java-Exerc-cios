package questao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class TesteClockDisplay {
    
    public static void main(String[] args) {
        ClockDisplay cd1 = new ClockDisplay(24, 59, 60);
        System.out.println(cd1.getTime());
        for (int i = 0; i < 120; i++) {
            cd1.timeTick();
            System.out.println(cd1.getTime());
        }
    }
    
}
