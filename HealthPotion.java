
/**
 * Write a description of class HealthPotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HealthPotion extends Potions
{
   public void heal(Character target){
       target.healDamage(Dice.d4() + 4);
   }
}
