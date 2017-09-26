import java.util.Random; 
import java.util.Observable; 
import java.util.Observer; 
/**
 * The model in MVC. 
 *
 * @author Marcus Trujillo
 * @version 9.20.17
 */
public class Game extends Observable
{    
    private int guessNumber; 
    private int currentGuess = 0; 
    private Random randomGenerator = new Random(); 
    String result; 
    
    /**
     * Constructor for objects of class Game. Establishes the number to guess between 0-1000
     * and instructs user to guess this. 
     */
    public Game()
    {
        guessNumber = randomGenerator.nextInt(1000);  
        System.out.println("Guess the number between 0-1001");  
        //move the above print to view
    }
    public void checkGuess(){
        if(currentGuess == guessNumber){
            result = "win"; 
        } else if(currentGuess < guessNumber){
            result = "Guess higher"; 
        } else if(currentGuess > guessNumber){
            result = "Guess lower"; 
        }
        
    }
    /*
     * the result of the last guess. 
     */
    public String getResult(){
        return result; 
    } 
    /*
     * After one game is finished we go here to determine if we'll play another
     */
    public void newGame(String playAgain){
        if(playAgain.equals("y")){
             guessNumber = randomGenerator.nextInt(1000); 
             result = " "; 
             setChanged(); 
             notifyObservers(); 
        } else{
            System.out.println("Thanks for playing"); 
            System.exit(0); 
        } 
        
    }
    /*
     * Sets the guess just taken as the current guess. 
     */
    public void setCurrentGuess(int guess){
        currentGuess = guess;
        checkGuess(); 
        setChanged(); 
        notifyObservers(); 
    }
}
