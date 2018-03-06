
/**
 * Write a description of class handXBow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class handXBow extends xBow
{
    int dmg = Dice.d6();
    String name = "Hand Crossbow";
    public handXBow(){
        super(Dice.d6(), "Hand Crossbow");
    }
}
