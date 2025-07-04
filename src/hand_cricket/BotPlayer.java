/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hand_cricket;

/**
 *
 * @author Aryan
 */
public class BotPlayer extends Player {
    @Override
    public int getMove(){
        return Utility.getRandom(6);
    }
    
    public BotPlayer(){
        setPlayerName("Bot");
    }
}
