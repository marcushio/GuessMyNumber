
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller implements ControllerInterface
{
    Game game; 
    ViewInterface view; 
    
    public Controller(Game game){
        this.game = game;       
    }
    public void setCurrentGuess(int guess){
        game.setCurrentGuess(guess); 
    }
    public void checkGuess(){
        game.checkGuess(); 
    }
    public void newGame(String playAgain){
        game.newGame(playAgain); 
    }
}
