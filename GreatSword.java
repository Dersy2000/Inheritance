
/**
 * Write a description of class GreatSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreatSword extends Melee implements TwoHanded
{
    int dmg = Dice.d12();
    String name = "Great Sword";
    public GreatSword(){
        super(Dice.d12(), "Great Sword");
    }
}
