
/**
 * Abstract class Melee - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Melee extends Weapon
{
    Oil oil;
    void addOil(Oil oil){
        this.oil = oil;
    }
    Oil getOil(){
     return oil;   
    }
    public Melee(int dmg, String name){
        super(dmg, name);
    }
}
