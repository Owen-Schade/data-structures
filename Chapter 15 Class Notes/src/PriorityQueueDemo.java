import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> students = new PriorityQueue<>();
        students.add("Grippers");
        students.add("Adrian");
        students.add("67");
        students.add("Gurt");
        students.add("Yo");

        while (students.size() > 0){
            System.out.println(students.remove());
        }
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        toDo.add(new WorkOrder(3, "Haircut"));
        toDo.add(new WorkOrder(2, "Water Plants"));
        toDo.add(new WorkOrder(1, "Water Plants"));
        toDo.add(new WorkOrder(9, "Amnesia Meds"));
        toDo.add(new WorkOrder(1, "Water Plants"));

        System.out.println(toDo);
        
        while ((toDo.size() > 0)) {
            System.out.println(toDo.remove());
        }
    }
}
