
/**
 * Write a description of class SilverSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SilverSword extends Melee implements OneHanded, TwoHanded
{
    //Oil oil;
    int dmg = Dice.d10();
    String name = "Silver Sword";
    public SilverSword(){
        super(Dice.d10(), "Silver Sword");
    }
}
