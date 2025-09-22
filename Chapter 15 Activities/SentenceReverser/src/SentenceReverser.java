import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        Stack<String> wordStack = new Stack<>();
        String output = "";
        while (scanner.hasNext()) {
            String temp = scanner.next().toLowerCase();
            wordStack.add(temp);
            if(temp.contains(".")){
                String first = wordStack.pop();
                output+=first.substring(0,1).toUpperCase()+first.substring(1,first.length()-1);
                while(!wordStack.empty()){
                    output+=" "+wordStack.pop();
                    System.out.println(output);
                }
                output+=". ";
            }
        }
        return output;
        






    }
}
