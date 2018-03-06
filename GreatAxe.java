
/**
 * Write a description of class GreatAxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreatAxe extends Melee implements TwoHanded
{
   int dmg = 12;
   String name = "Great Axe";
   public GreatAxe(){
       super(Dice.d12(), "Great Axe");
   }
}
