
/**
 * Write a description of class Griffin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Griffin extends Beast
{
    public Griffin(){
        super(13, 50);
    }

    public int attack(Character d){
        int type = Dice.d3();
        int roll = Dice.d20();
        if(type == 1){
            if(roll + 2>= d.AC()){
                d.takeDamage(5);
            }
        }
        if(type == 2){
            if(roll + 1>= d.AC()){
                d.takeDamage(4);
            }
        }
        if(type == 3){
            if(roll + 3>= d.AC()){

            }
        }
    }
}
