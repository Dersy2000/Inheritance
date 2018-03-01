
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    Melee weapon;
    Ranged rweapon;
    public Player(){
        weapon = new SteelSword(Dice.d10(), "Steel Sword");
    }
    public int attack (int dmg){
        if (weapon.getOil() instanceof BeastOil){
            System.out.println("Additional Dmg");
        }else{
            System.out.println("Regular Dmg");   
        } 
        return dmg;
    }
    public void addBeastOil(){
        weapon.addOil(new BeastOil());
    }
    public void addWraithOil(){
        weapon.addOil(new WraithOil());
    }
}
