
/**
 * Write a description of class Controller here.
 *
 * @author Marcus Trujillo
 * @version 9.25.17
 */
public class Controller implements ControllerInterface
{
    Game game;  
    
    public Controller(Game game){
        this.game = game;       
    }
    public void setCurrentGuess(int guess){
        game.setCurrentGuess(guess); 
    }
    public void newGame(String playAgain){
        game.newGame(playAgain); 
    }
}
