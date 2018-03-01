
/**
 * Write a description of class longBow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class longBow extends Bow
{
    int dmg = Dice.d8();
    String name = "Long Bow";
    public longBow(int dmg, String name){
        super(dmg, name);
    }
}
