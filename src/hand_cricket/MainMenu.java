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
            case 1:
                String name = Utility.inputStr("Enter your Name");
                p1 = new Player();
                p1.setPlayerName(name);
                p2 = new BotPlayer();
                TestMatch match1 = new TestMatch();
                match1.round1(p1, p2);
                break;
                
            case 2:
                String name1 = Utility.inputStr("Player 1, Enter your Name");
                String name2 = Utility.inputStr("Player 2, Enter your Name");
                p1 = new Player();
                p1.setPlayerName(name1);
                p2 = new Player();
                p2.setPlayerName(name2);
                TestMatch match2 = new TestMatch();
                match2.round1(p1, p2);
                break;
            
            default:
                System.out.println("Invalid Choice. Please try again....");
                main(null);
                break;
        }
    }
}
