
/**
 * Abstract class Ranged - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Ranged extends Weapon
{
     public boolean parry(){
        boolean parry = false;
        return parry; 
    }
    public Ranged(int dmg, String name){
        super(dmg, name);
    }
}
