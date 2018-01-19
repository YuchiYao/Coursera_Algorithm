import edu.princeton.cs.algs4.*;
/*  Stack with max. Create a data structure that efficiently supports the stack operations (push and pop) and also a return-the-maximum operation. Assume the elements are reals numbers so that you can compare them.
 */
import java.util.LinkedList;

public class Stackmax {
    Node sentienl;
    class Node{
        int val;
        Node next;
        int max = Integer.MAX_VALUE;
        Node(int value,Node nextNode ){
            val = value;
            next = nextNode;
        }
    }
    Stackmax(){
        sentienl = new Node(-1,null);
    }

    public void push(int element){
        Node after = sentienl.next;
        sentienl.next = new Node(element,after);
        if(after==null){
            sentienl.next.max=element;
        }
        else{
            if(after.max<element){
                sentienl.next.max = element;
            }else{
                sentienl.next.max = after.max;
            }
        }
    }

     public int pop(){
        Node after = sentienl.next;
        sentienl.next = after.next;
        return after.val;
     }

     public int max(){
         return sentienl.next.max;
     }

     public static void main (String args[]){
         Stackmax max = new Stackmax();
         max.push(1);
         max.push(4);
         max.push(2);
         System.out.println(max.max());
         max.pop();
         max.pop();
         System.out.println(max.max());
     }




}
