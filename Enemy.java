
/**
 * Abstract class Enemy - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Enemy extends Character
{
   int health;
   int AC;
   public Enemy(int health, int AC){
       super(health, AC);
   }
}
