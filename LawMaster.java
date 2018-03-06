
/**
 * Write a description of class LawMaster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LawMaster extends NPC
{
    int AC;
    int health;
    Armor HalfPlate;
    Weapon ShortSword;
    public LawMaster(int AC, int health){
        super(16, 25);
        HalfPlate = new HalfPlate();
        ShortSword = new ShortSword();
    }
}
