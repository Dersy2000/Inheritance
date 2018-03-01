
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
   public int health = 15;
   public Bartender(){
       weapon = new Dagger();
       clothing = new Clothes(8, 2, "Clothes");
   }
}
