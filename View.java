import java.util.Observable; 
/**
 * This is the view of the Guess My Number Game
 *
 * @author (Marcus T)
 * @version (9/20/17)
 */
public class View implements ViewInterface
{
    Game game; 
    ControllerInterface controller; 
    private InputGet inputGetter; 

    /**
     * Constructor for objects of class View
     */
    public View(Game game, ControllerInterface controller)
    {
        this.game = game; 
        this.controller = controller; 
        inputGetter = new InputGet();
    }
    /*
     * displays teh result of the last guess. 
     */
    public void displayGuessResult(){
        String result = game.getResult(); 
        System.out.println(result); 
        if(result == "win"){
            displayWin(); 
        }
    }
    /*
     * displays a message notifying the user they've guessed the number
     */
    public void displayWin(){
        String playAgain; 
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("***                    ***");
        System.out.println("***     YOU WIN!!!     ***");  
        System.out.println("***                    ***");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("play again? y/n");
        playAgain = inputGetter.getInput(); 
        controller.newGame(playAgain); 
    }
    /*
     * Prompts the user for a guess about the number
     */
    public void promptUser(){
        System.out.println("> "); 
        String input = inputGetter.getInput(); 
        int guess = Integer.parseInt(input); 
        controller.setCurrentGuess(guess);  
    }
    public void update(Observable game, Object o){
        this.game = (Game) game; 
        displayGuessResult(); 
        promptUser(); 
    }
}
   

