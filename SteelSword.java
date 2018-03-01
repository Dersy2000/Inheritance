
/**
 * Write a description of class SteelSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SteelSword extends Melee implements OneHanded, TwoHanded
{
    
    //boolean twoHanded;
    //boolean isTwoHanded(){
    //   return twoHanded; 
    //}
    int dmg = Dice.d10();
    String name = "Steel Sword";
    public SteelSword(int dmg, String name){
        super(dmg, name);
    }
}
