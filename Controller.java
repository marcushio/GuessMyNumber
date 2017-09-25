
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller implements ControllerInterface
{
    GameInterface game; 
    ViewInterface view; 
    
    public Controller(GameInterface game){
        this.game = game;       
    }
    public void setCurrentGuess(int guess){
        game.setCurrentGuess(guess); 
    }
    public void displayGuess(){
        view.displayGuessResult(); 
    }
    public void checkGuess(int guess){
        game.checkGuess(guess); 
    }
    public void displayWin(){
        view.displayWin(); 
    }
}
