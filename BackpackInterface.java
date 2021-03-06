
/**
 * These methods are required for this project.
 * 
 * @author Jayden Ders 
 * @version 
 */
public interface BackpackInterface
{
    /**
     * Puts an item into the backpack
     * 
     * @param  x    The item to be stored
     * @return        true if added, false if not.
     */
    boolean storeItem(Item x);
    /**
     * Counts the number of items in the backpack
     * 
     * 
     * @return        The number of items in the backpack
     */
    int countItems();
}
