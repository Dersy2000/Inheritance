
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    int AC;
    int health;
    public Character(int AC, int health){
     this.AC = AC;
     this.health = health;
    }
    public void attack(Character target){
      int roll = Dice.d20();
      if(roll >= target.AC){
           target.health = target.health;
           System.out.println("Your attack hits.");
      }
      if(roll < target.AC){
          System.out.println("Your attack misses.");
      }
    }
    public void takeDamage(int dmg){
     health -= dmg;   
    }
}
