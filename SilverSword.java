
/**
 * Write a description of class SilverSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SilverSword extends Melee implements OneHanded, TwoHanded
{
    //Oil oil
    boolean twoHanded = false;
    public SilverSword(){
        super(Dice.d10(), "Silver Sword");
    }
    public void toggleTwoHanded(){
        if(!twoHanded){
            twoHanded = true;
            setDamage(Dice.d12());
        }else{
            setDamage(Dice.d10());
            twoHanded = false;
        }
    }
}
