
/**
 * Write a description of class DoubleBladedSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleBladedSword extends Melee implements TwoHanded
{
    //will crit on 18-20
    int dmg = 8;
    String name = "Double Bladed Sword";
    public DoubleBladedSword(){
        super(Dice.d8(), "Double Bladed Sword");
    }

    public int attack(){
        int roll = Dice.d20();
        int damage;
        if(roll >= 18){
            damage = Dice.d8() + Dice.d8();
        }else{
            damage = Dice.d8();
        }
        return damage;
    }
}
