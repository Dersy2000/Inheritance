
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
    public int attack(Character target){
      int roll = Dice.d20();
      if(roll >= target.AC){
           target.health = target.health;
           System.out.println("Your attack hits.");
      }
      if(roll < target.AC){
          System.out.println("Your attack misses.");
      }
      return roll;
    }
    public void takeDamage(int dmg){
        health -= dmg;   
    }
    public void healDamage(int heal){
        health += heal;
    }
}
