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
    public Object getFirst() {
        if (this.firt == null){
            throw new NoSuchElementException();
        }
        return this.firt.data;
    }



    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst() {
        if (this.firt == null){
            throw new NoSuchElementException();
        }
        Object temp = this.firt.data;
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
    public ListIterator getIterator(){
        return new LinkedListIterator();
    }

    public String toString(){
        ListIterator listIterator = getIterator();
        String allElements = "[";
        while(listIterator.hasNext()){
            allElements+=listIterator.next() + ", ";
        }
        return allElements.substring(0,allElements.length()-2)+"]";
    }

    /* 
    public int size(){
        int count = 0;
        Node current = firt;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
        */

    public int size(){
        return size(firt);
    }

    public int size(Node here){
        if(here!=null){
            return size(here.next)+1;
        }
        return 0;
    }
/* 
    public boolean contains(Object ts){
        Node current = firt;
        while(current!=null){
            if(current.data==ts){
                return true;
            }
            current=current.next;
        }
        return false;
    }
        */

    public boolean contains(Object ts){
        return contains(firt, ts);
    }

    public boolean contains(Node here, Object ts){
        if(here!=null){
            if(here.data==ts){
                return true;
            }
            return contains(here.next, ts);
        }
        return false;
    }


    //Class Node
    static class Node {
        public Node next = null;
        public Object data = null;
    }


    class LinkedListIterator implements ListIterator
    {
        public boolean nextCalledLast;
        public Node current;
        public Node previous;


        /**
            Constructs an iterator that points to the front
            of the linked list.
        */
        public LinkedListIterator(){
            nextCalledLast=false;
            current=null;
            previous=null;
        }


        /**
            Moves the iterator past the next element.
            @return the traversed element
        */
        public Object next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            previous=current;
            if (current == null){
                current=firt;
            }else{
                current=current.next;
            }
            nextCalledLast=true;
            return current.data;
        }




        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */
        public boolean hasNext(){
            if(current == null) {
                return firt != null;
            }
            return current.next != null;
        }


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */
        public void add(Object ts){
            nextCalledLast = false;
            if(current==null){
                addFirst(ts);
                current=firt;
            }else{
                Node totr = new Node();
                totr.data = ts;
                totr.next = current;
                previous.next = totr;
                previous=totr;
                current=totr;
            }

        }





        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */
        public void remove(){
            if(!nextCalledLast){
                throw new IllegalStateException();
            }
            if(current==firt){
                removeFirst();
                current = null;
            }else{
                previous.next = current.next;
                current = previous;
            }
            nextCalledLast = false;
        }






        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */
        public void set(Object element){
            if (!nextCalledLast){
                throw new IllegalStateException();
            }
            current.data = element;
        }



    }//LinkedListIterator
}//LinkedList
