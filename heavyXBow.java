
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
   public heavyXBow(){
       super(Dice.d10(), "Heavy Crossbow");
   }
}
