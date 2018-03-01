
/**
 * Write a description of class SilverSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SilverSword extends Melee implements OneHanded, TwoHanded
{
    //Oil oil;
    //WILL DEAL MORE DAMAGE TO MONSTERS
    int dmg = Dice.d10();
    String name = "Silver Sword";
    public SilverSword(int dmg, String name){
        super(dmg, name);
    }
}
