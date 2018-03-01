 
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements DefenseCommands
{
   int AC;
   int weight;
   String Name;
   public Armor(int AC, int weight, String Name){
       this.AC = AC;
       this.weight = weight;
       this.Name = Name;
   }
    public boolean blocked(){
       boolean blocked = true;
       return blocked;
   }
}
