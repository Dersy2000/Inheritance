
/**
 * Abstract class Beast - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Beast extends Enemy
{
    int health;
    int AC;
    public Beast(int health, int AC){
        super(health, AC);
    }
}
