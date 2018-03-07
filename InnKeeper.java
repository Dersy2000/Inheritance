
/**
 * Write a description of class InnKeeper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InnKeeper extends NPC
{
   int AC;
   int health;
   Armor clothing;
   public InnKeeper(int AC, int health){
       super(10, 15);
       clothing = new Clothes();
   }
}
