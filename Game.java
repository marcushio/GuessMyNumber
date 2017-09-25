import java.util.Random; 
import java.util.Observable; 
import java.util.ArrayList; 
import java.util.Observer; 
/**
 * Write a description of class Game here.
 *
 * @author (Marcus Trujillo)
 * @version (9.20.17)
 */
public class Game extends Observable
{
    ControllerInterface controller;
    ViewInterface view; 
    
    private int guessNumber; 
    private String guess;
    private int currentGuess; 
    ArrayList<Observer> observers; 
    private Random randomGenerator = new Random(); 
    String result; 
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        guessNumber = randomGenerator.nextInt(1000);  
        currentGuess = 0; 
        //for testing print the number so you don't actually have to play
        System.out.println(guessNumber); 
        
        System.out.println("Guess the number between 0-1001");  
        
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
    public String getResult(){
        return result; 
    } 
    public void newGame(String playAgain){
        if(playAgain.equals("y")){
             guessNumber = randomGenerator.nextInt(1000); 
             result = " "; 
             //get rid of after testing
             System.out.println(guessNumber); 
             setChanged(); 
             notifyObservers(); 
        } else{
            System.out.println("Thanks for playing"); 
            System.exit(0); 
        } 
        
    }
    /*
     * Gets what the user guessed in the form of an int.
     */
    public int getCurrentGuess(){
        return currentGuess; 
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
    /*
     * Gets the number we're trying to guess. 
     */
    public int getGuessNumber(){
        return guessNumber; 
    }
}
