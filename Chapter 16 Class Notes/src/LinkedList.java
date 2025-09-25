import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{


    private Node firt;

    public LinkedList(){
        this.firt = null;
    }


    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Node getFirst() {
        if (this.firt == null){
            throw new NoSuchElementException();
        }
        return this.firt;
    }



    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Node removeFirst() {
        if (this.firt == null){
            throw new NoSuchElementException();
        }
        Node temp = this.firt;
        this.firt = firt.next;
        return temp;
    }




    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object ts){
        Node nNode = new Node();
        nNode.data=ts;
        nNode.next = firt;
        firt = nNode;
    }




    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */





    //Class Node
    static class Node {
        public Node next = null;
        public Object data = null;
    }


    class LinkedListIterator //implements ListIterator
    {
        


        /**
            Constructs an iterator that points to the front
            of the linked list.
        */


        /**
            Moves the iterator past the next element.
            @return the traversed element
        */





        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */






        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */







        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */




    }//LinkedListIterator
}//LinkedList
