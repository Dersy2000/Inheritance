
/**
 * Write a description of class longSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class longSword extends Melee implements OneHanded
{
    int dmg = Dice.d8();
    String name = "Long Sword";
    public longSword(){
        super(Dice.d8(), "LongSword");
    }
}
