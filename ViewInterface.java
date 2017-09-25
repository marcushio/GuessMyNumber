import java.util.Observable; 
import java.util.Observer; 
/**
 * Write a description of interface ViewInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface ViewInterface extends Observer
{
    /**
     * 
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public void displayWin();
    public void promptUser(); 
    public void displayGuessResult(); 
    public void update(Observable game, Object o); 
    
}
