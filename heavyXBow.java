
/**
 * Write a description of class heavyXBow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class heavyXBow extends xBow
{
   int dmg = Dice.d10();
   String name = "Heavy Crossbow";
   public heavyXBow(int dmg, String name){
       super(dmg, name);
   }
}
