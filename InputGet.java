import java.util.Scanner; 
/**
 * Write a description of class Input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputGet
{
    private Scanner in; 
    String guess = " "; 
    /*
     * 
     */
    public InputGet(){
       in = new Scanner(System.in);
    }
    /*
     * assigns a string to the input and
     * @return the string input by the user. 
     */
    public String getInput(){
        System.out.print("> "); 
        guess = in.next(); 
        return guess; 
    }
   
    
    
}
