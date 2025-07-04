/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hand_cricket;

import java.util.ArrayList;

/**
 *
 * @author Aryan
 */
public class Player {
    private int score, target;
    private ArrayList<Integer> statBat = new ArrayList<>();
    private ArrayList<Integer> statBall = new ArrayList<>();
    private String playerName;
    private boolean isPlayerDead = false;
    
    public boolean getPlayerStatus(){
        return isPlayerDead;
    }
    
    public void setPlayerStatus(boolean status){
        isPlayerDead = status;
    }
    
    public void updateScore(int run){
        if(run>=0 && run<=6){
            score += run;
        }
    }
    
    public int getMove(){
        return Utility.inputNum(playerName+", Make your Move");
    }
    
    public int getScore(){
        return score;
    }
    
    public void setTarget(){
        target = score+1;
    }
    
    public int getTarget(){
        return target;
    }
    
    public void setPlayerName(String name){
        playerName = name;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public void updateStatBat(int run){
        statBat.add(run);
    }
    
    public void updateStatBall(int run){
        statBall.add(run);
    }
    
    public void displayResult(int code){
        switch(code){
            case 0:
                System.out.println(playerName+", You won the match!");
                break;
                
            case 1:
                System.out.println(playerName+", you lost the match!");
                break;
                
            case 2:
                System.out.println(playerName+", you are dead!");
                break;
        }
    }
}
