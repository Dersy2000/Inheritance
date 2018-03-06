
/**
 * Write a description of class ShortSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShortSword extends Melee implements OneHanded
{
    int dmg = Dice.d6();
    String name = "Short Sword";
    public ShortSword(){
        super(Dice.d6(), "Short Sword");
    }
}
