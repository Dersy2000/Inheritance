
/**
 * Write a description of class TownMaster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TownMaster extends NPC
{
   int AC;
   int health;
   Armor clothing;
   public TownMaster(int AC, int health){
       super(10, 15);
       clothing = new Clothes(8, 2, "Clothes");
   }
}
