
/**
 * Write a description of class lightXBow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lightXBow extends xBow
{
    //will have a reload method
    int dmg = Dice.d8();
    String name = "Light Crossbow";
    public lightXBow(int dmg, String name){
        super(dmg, name);
    }
}
