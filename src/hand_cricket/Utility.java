/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hand_cricket;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aryan
 */
public class Utility {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    public int inputNum(String msg){
        System.out.print(msg+": ");
        return sc.nextInt();
    }
    
    public String inputStr(String msg){
        System.out.print(msg+": ");
        return sc.next();
    }
    
    public int getRandom(int upper){
        return rand.nextInt(upper+1);
    }
}
