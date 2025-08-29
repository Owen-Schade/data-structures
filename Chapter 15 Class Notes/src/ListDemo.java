import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        System.out.println("Gurt");
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");

        System.out.println(staff);

        ListIterator<String> iterator = staff.listIterator();

        iterator.next();

        String avenger = iterator.next();
        System.out.println(avenger);

        iterator.add("Clint");
        iterator.add("Bruce");

        iterator.next();
        iterator.remove();

        iterator.previous();
        iterator.set("Thor");

        for(String n: staff){
            System.out.print(n+" ");
        }

        //while (iterator.hasNext()) {
        //    String n = iterator.next();
        //    if (n.equals("Tony")) {
        //        staff.remove();
        //    }
        //}

        for (String n: staff){
            if (n.equals("Tony")){
                staff.add("T'Challa");
            }
        }
        System.out.println(staff);
    }
}
