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
public class Game extends Observable implements GameInterface  
{
    ControllerInterface controller;
    ViewInterface view; 
    
    private int guessNumber; 
    private String guess;
    private int currentGuess; 
    ArrayList<Observer> observers; 
    private final Random randomGenerator = new Random(); 
    boolean running; 
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        observers = new ArrayList(); 
        guessNumber = randomGenerator.nextInt(1000);  
        currentGuess = 0; 
        //for testing print the number so you don't actually have to play
        System.out.println(guessNumber); 
        
        System.out.println("Guess the number between 0-1001");  
        
    }
    public void checkGuess(int guess){
        if(guess == guessNumber){
            controller.displayWin(); 
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
        guess = currentGuess;
        checkGuess(guess); 
        setChanged(); 
        notifyObservers(); 
    }
    /*
     * Gets the number we're trying to guess. 
     */
    public int getGuessNumber(){
        return guessNumber; 
    }
    /*
     * Adds the object to the list of observers. 
     */
    public void registerObserver(Observer observer){
        observers.add(observer); 
    }
    /*
     * Removes the object from the list of observers
     */
    public void removeObserver(Observer observer){
        observers.remove(observer); 
    }
}
