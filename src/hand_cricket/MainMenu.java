/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hand_cricket;

/**
 *
 * @author Aryan
 */
public class MainMenu {
    private static Player p1, p2;
    public static void main(String[] args){
        
        System.out.println("=================================");
        System.out.println("Hand Cricket");
        System.out.println("=================================\n\n");
        System.out.println("1. You v\\s Bot");
        System.out.println("2. Friend v\\s Friend\n\n\n");
        int ch = Utility.inputNum("Enter your choice");
        
        switch(ch){
            case 1 -> {
                String name = Utility.inputStr("Enter your Name");
                p1 = new Player();
                p1.setPlayerName(name);
                p2 = new BotPlayer();
                toss(1);
            }
                
            case 2 -> {
                String name1 = Utility.inputStr("Player 1, Enter your Name");
                String name2 = Utility.inputStr("Player 2, Enter your Name");
                p1 = new Player();
                p1.setPlayerName(name1);
                p2 = new Player();
                p2.setPlayerName(name2);
                toss(2);
            }
            
            default -> {
                System.out.println("Invalid Choice. Please try again....");
                main(null);
            }
        }
    }
    
    public static void toss(int type){
        if(type == 1){//Player v/s Bot
            char ch = Utility.inputStr("Type 'H' for heads or 'T' for Tails").charAt(0);
            int a=0;
            switch(ch){
                case 'h' -> a=0;
                
                case 'H' -> a=0;
            
                case 't' -> a=1;
                
                case 'T' -> a=1;
                
                default -> {
                    System.out.println("Please enter a valid input!");
                    toss(1);
                }
            }
            
            if(a==Utility.getRandom(1)){
                System.out.println(p1.getPlayerName()+", You won the toss!\n1. Batting\n2. Bowling\n\n");
                int b = Utility.inputNum("Enter your choice");
                
                if(b == 1){
                    TestMatch match1 = new TestMatch();
                    match1.round1(p1, p2);
                }else{
                    TestMatch match1 = new TestMatch();
                    match1.round1(p2, p1);
                }
            }else{
                System.out.print("Bot won the toss!");
                
                if(Utility.getRandom(1) == 1){
                    System.out.println(" and he chose to bowl first");
                    TestMatch match1 = new TestMatch();
                    match1.round1(p1, p2);
                }else{
                    System.out.println(" and he chose to bat first");
                    TestMatch match1 = new TestMatch();
                    match1.round1(p2, p1);
                }
            }
            
        }
        
        if(type == 2){
            char ch = Utility.inputStr(p1.getPlayerName()+", Type 'H' for heads or 'T' for Tails").charAt(0);
            int a=0;
            switch(ch){
                case 'h' -> a=0;
                
                case 'H' -> a=0;
            
                case 't' -> a=1;
                
                case 'T' -> a=1;
                
                default -> {
                    System.out.println("Please enter a valid input!");
                    toss(1);
                }
            }
            
            if(a==Utility.getRandom(1)){
                System.out.println(p1.getPlayerName()+", You won the toss!\n1. Batting\n2. Bowling\n\n");
                int b = Utility.inputNum("Enter your choice");
                
                if(b == 1){
                    TestMatch match1 = new TestMatch();
                    match1.round1(p1, p2);
                }else{
                    TestMatch match1 = new TestMatch();
                    match1.round1(p2, p1);
                }
            }else{
                System.out.println(p2.getPlayerName()+", You won the toss!\n1. Batting\n2. Bowling\n\n");
                int b = Utility.inputNum("Enter your choice");
                
                if(b == 1){
                    TestMatch match1 = new TestMatch();
                    match1.round1(p2, p1);
                }else{
                    TestMatch match1 = new TestMatch();
                    match1.round1(p1, p2);
                }
            }
        }
    }
}
