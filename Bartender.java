
/**
 * Write a description of class Bartender here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bartender extends NPC
{
   Melee weapon;
   Armor clothing;
   private int health = 15;
   public Bartender(){
       super(8, 15);
       weapon = new Dagger();
       clothing = new Clothes();
   }
   public int attack(Character d){
      int roll = Dice.d20();
      if(roll >= d.AC){
           d.takeDamage(weapon.attack());
           System.out.println("Your attack hits.");
      }
      if(roll < d.AC){
          System.out.println("Your attack misses.");
      }
      return roll;
    }
}
