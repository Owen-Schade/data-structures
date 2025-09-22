import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> jobs = new LinkedList<>();

        jobs.add("Gurt: Yo");
        jobs.add("Adrian: Friend group explanation");
        jobs.add("Coffee: Spelled Backwards");

        System.out.println("Printing: "+jobs.remove());

        jobs.add("Barber: 25c");
        jobs.add("6: 7");
        jobs.add("41: But i got 41 gold");

        System.out.println("Printing: "+jobs.remove());
        System.out.println("Printing: "+jobs.remove());

        jobs.add("Xray: Vision for grippers");
        
        int len = jobs.size();
        for(int i = 0; i<len; i++){
            System.out.println("Printing: " + jobs.remove());
        }
    }
}
