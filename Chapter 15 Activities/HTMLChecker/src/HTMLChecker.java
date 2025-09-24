import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "C:\\Users\\ocschade\\projects\\data-structures\\Chapter 15 Activities\\HTMLChecker\\src\\TagSample2.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            Stack<String> tStack = new Stack<>();
            boolean invalid = false;
            while(in.hasNext()){
                String temp = in.next();
                if (temp.charAt(1)=='/'){
                    if(temp.substring(2).equals(tStack.peek().substring(1))){
                        tStack.pop();
                    }else{
                        invalid=true;
                    }
                }else{
                    tStack.push(temp);
                }
            }
            if(tStack.empty() && !invalid){
                System.out.println("All good!");
            }else{
                System.out.println("Do better!");
            }


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
