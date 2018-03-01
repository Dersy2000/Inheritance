
/**
 * Write a description of class DoubleBladedSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleBladedSword extends Melee implements TwoHanded
{
   //will crit on 18-20
   int dmg = 8;
   String name = "Double Bladed Sword";
   public DoubleBladedSword(int dmg, String name){
       super(dmg, name);
   }
}
