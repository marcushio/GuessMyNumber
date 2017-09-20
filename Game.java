import java.util.Random; 
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private InputGet inputGetter; 
    private int guessNumber; 
    private boolean running = true; 
    private String guess; 
    private final Random randomGenerator = new Random(); 
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        System.out.println("Guess the number between 0-1001");  
        
        inputGetter = new InputGet(); 
    }
    /*
     * 
     */
    public void run(){
        guessNumber = randomGenerator.nextInt(1000); 
        System.out.println(guessNumber); 
        do{
            guess = inputGetter.getInput(); 
   
            int numGuess = Integer.parseInt(guess); 
            if(numGuess > guessNumber){
                System.out.println("Guess lower"); 
            } else if (numGuess < guessNumber){
                System.out.println("Guess higher"); 
            } else if(numGuess == guessNumber){
                running = false; 
            }
        } while(running); 
        displayWin(); 
    }
    /*
     * 
     */
    public void displayWin(){
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("***                    ***");
        System.out.println("***    YOU WIN!!!      ***");  
        System.out.println("***                    ***");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("play again? y/n");
        String answer = inputGetter.getInput();   
        if(answer.equals("y")){
            running = true; 
            run(); 
        } 
    }
}
