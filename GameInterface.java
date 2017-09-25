import java.util.Observer; 
/**
 * Write a description of interface GameInterface here.
 *
 * @author (Marcus Trujillo)
 * @version (9.21.17)
 */
public interface GameInterface 
{
    /*
     * registers the observers of the model
     */
    public void registerObserver(Observer o); 
    /*
     * removes the observers from the observer list 
     */
    public void removeObserver(Observer o); 
    /*
     * 
     */
    public void notifyObservers(); 
    /*
     * retrieves the current guess. 
     */
    public int getCurrentGuess(); 
    /*
     * Sets the current guess. 
     */
    public void setCurrentGuess(int guess);
    /*
     * retrieves the number that we're trying to guess.
     */
    public int getGuessNumber(); 
    public void checkGuess(int guess); 
}
