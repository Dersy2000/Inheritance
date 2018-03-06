
/**
 * Write a description of class shortBow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shortBow extends Bow
{
    int dmg = Dice.d6();
    String name = "Short Bow";
    public shortBow(){
        super(Dice.d6(), "Short Bow");
    }
}
