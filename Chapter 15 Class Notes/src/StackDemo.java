import java.util.Stack;

import javax.sound.midi.SysexMessage;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        System.out.println("gurt");
        Stack<String> commands = new Stack<>();
        commands.push("Insert: 'Hello'");
        commands.push("Insert: ','");
        commands.push("Insert: ' '");
        commands.push("Insert: 'gurt'");
        commands.push("Insert: '?'");
        commands.push("Delete: '?'");
        commands.push("Insert: '!'");
        System.out.println(commands);

        for(int i=0; i<4; i++){
            System.out.println("Undo "+commands.pop());
        }

        System.out.println(commands);
    }
}
