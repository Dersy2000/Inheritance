
/**
 * Write a description of class SteelSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SteelSword extends Melee implements OneHanded, TwoHanded
{
    boolean twoHanded = false;
    public void toggleTwoHanded(){
        if(!twoHanded){
            twoHanded = true;
            setDamage(Dice.d12());
        }else{
            setDamage(Dice.d10());
            twoHanded = false;
        }
    }
    public SteelSword(){
        super(Dice.d10(), "Steel Sword");
    }
}
