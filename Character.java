
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
    public void attack(Character a, Character d, Weapon w){
      int roll = Dice.d20();
      if(roll >= d.AC){
           d.health = d.health - w.getDamage();
      }
      if(roll < d.AC){
          System.out.println("Your attack misses.");
      }
      if (roll >= d.AC){
          System.out.println("Your attack hits.");
      }
    }
}
