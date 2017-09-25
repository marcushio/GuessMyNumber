import java.util.Observer; 
import java.util.Observable; 
/**
 * Write a description of class Main here.
 *
 * @author (Marcus Trujillo)
 * @version (9.22.17)
 */
public class Main
{   
    public static void main(String args[]){
        Observable game = new Game(); 
        ControllerInterface controller = new Controller((Game)game); 
        ViewInterface view = new View((Game)game, controller); 
        game.addObserver(view);  
        view.promptUser(); 
    }
}
