/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hand_cricket;

/**
 *
 * @author Aryan
 */
public class TestMatch {
    public void round1(Player batter, Player bowler){
        while(batter.getPlayerStatus() != true){
            int batterMove = batter.getMove();
            int bowlerMove = bowler.getMove();
            batter.updateStatBat(batterMove);
            bowler.updateStatBall(bowlerMove);
            
            if(batterMove != bowlerMove){
                batter.updateScore(batterMove);
            }
            
            System.out.println("================================");
            System.out.println(batter.getPlayerName()+"'s Score: "+batter.getScore());
            System.out.println(batter.getPlayerName()+"'s Move: "+batterMove);
            System.out.println(bowler.getPlayerName()+"'s Move: "+bowlerMove);
            System.out.println("================================\n");
            
            if(batterMove == bowlerMove){
                batter.setPlayerStatus(true);
                bowler.setPlayerStatus(false);
                batter.setTarget();
                batter.displayResult(2);
                System.out.println("Target for "+bowler.getPlayerName()+": "+batter.getTarget());
                round2(bowler, batter);
                break;
            }
        }
    }
    
    public void round2(Player batter, Player bowler){
        while(batter.getPlayerStatus() != true && bowler.getTarget()>batter.getScore()){
            int batterMove = batter.getMove();
            int bowlerMove = bowler.getMove();
            batter.updateStatBat(batterMove);
            bowler.updateStatBall(bowlerMove);
            
            if(batterMove != bowlerMove && bowler.getTarget() > batter.getScore()){
                batter.updateScore(batterMove);
            }
            
            System.out.println("================================");
            System.out.println(batter.getPlayerName()+"'s Target: "+bowler.getTarget());
            System.out.println(batter.getPlayerName()+"'s Score: "+batter.getScore());
            System.out.println(batter.getPlayerName()+"'s Move: "+batterMove);
            System.out.println(bowler.getPlayerName()+"'s Move: "+bowlerMove);
            System.out.println("================================\n");
            
            if(batterMove == bowlerMove){
                batter.setPlayerStatus(true);
                bowler.setPlayerStatus(false);
                batter.displayResult(1);
                bowler.displayResult(0);
                break;
            }
            
            if(batter.getScore()>= bowler.getTarget()){
                batter.displayResult(0);
                bowler.displayResult(1);
                break;
            }
        }
    }
}
