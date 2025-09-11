import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        HashMap<String, String> gBook = new HashMap<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {

                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Please enter name and grade: ");
                gBook.put(in.next(), in.next());

            } else if (input.equals("R"))
            {
                System.out.println("Please enter name: ");
                String n = in.next();
                if(gBook.containsKey(n)){
                    gBook.remove(n);
                }
            } else if (input.equals("M"))
            {
                System.out.println("Please enter name: ");
                String n = in.next();
                if(gBook.containsKey(n)){
                    System.out.println("Please enter grade: ");
                    gBook.put(n, in.next());
                }
            } else if (input.equalsIgnoreCase("P"))
            {
                Set<String> keys = gBook.keySet();
                for (String key: keys){
                    System.out.println(key+": "+gBook.get(key));
                }
            } else
            {
                done = true;
            }
        }
    }
}
