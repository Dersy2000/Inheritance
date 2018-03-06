
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int dmg;
    public Weapon(int dmg, String name){
        this.dmg = dmg;
        this.name = name;
    }
    public int attack(){
        int attack = 0;
        return attack;
    }
    public boolean parry(){
        boolean parry = true;
        return parry; 
    }
    public int getDamage(){
        return dmg;
    }
    public boolean parry(){
        int roll = Dice.d20();
        return false; 
        //finish later
    }
}
