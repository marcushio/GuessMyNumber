import java.util.Observable; 
/**
 * This is the view of the Guess My Number Game
 *
 * @author (Marcus T)
 * @version (9/20/17)
 */
public class View implements ViewInterface
{
    GameInterface game; 
    ControllerInterface controller; 
    private InputGet inputGetter; 

    /**
     * Constructor for objects of class View
     */
    public View(GameInterface game, ControllerInterface controller)
    {
        this.game = game; 
        this.controller = controller; 
        inputGetter = new InputGet();
        promptUser(); 
    }
    
    /*
     * displays a message notifying the user they've guessed the number
     */
    public void displayWin(){
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("***                    ***");
        System.out.println("***     YOU WIN!!!     ***");  
        System.out.println("***                    ***");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("play again? y/n");
        String answer = inputGetter.getInput();   
        if(answer.equals("y")){
            game = new Game(); 
        } 
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
    public void displayGuessResult(){
        
        promptUser(); 
    }
    public void update(Observable game, Object o){
        this.game = (GameInterface)game; 
        promptUser(); 
    }
}
   

