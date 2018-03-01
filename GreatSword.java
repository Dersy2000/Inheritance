
/**
 * Write a description of class GreatSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreatSword extends Melee implements TwoHanded
{
    int dmg = 12;
    String name = "Great Sword";
    public GreatSword(int dmg, String name){
        super(dmg, name);
    }
}
