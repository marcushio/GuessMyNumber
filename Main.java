
/**
 * Write a description of class Main here.
 *
 * @author (Marcus Trujillo)
 * @version (9.22.17)
 */
public class Main
{   
    public static void main(String args[]){
        GameInterface game = new Game(); 
        ControllerInterface controller = new Controller(game); 
        ViewInterface view = new View(game, controller); 
        game.registerObserver(view);  
    }
}
