import java.util.LinkedList;


/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        //ListIterator<String> iterator = strings.listIterator();
        for (int i = 0; i<strings.size()-1; i++){
            String n = strings.removeLast();
            strings.add(i, n);
        }
    }
}