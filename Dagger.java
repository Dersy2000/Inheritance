
/**
 * Write a description of class Dagger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dagger extends Melee implements OneHanded
{
    public Dagger(){
        super(Dice.d4(), "Dagger");
    }
    public int attack(){
        return Dice.d4();
    }
}
