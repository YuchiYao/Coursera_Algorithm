import edu.princeton.cs.algs4.*;

public class QueueStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    void enque(int i){
            s1.push(i);
    }
    int denque(){
        if(s2.size()==0){
            while(s1.size()>0){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String args[]){
        QueueStack stack1 = new QueueStack();
        stack1.enque(1);
        stack1.enque(2);
        stack1.enque(3);
        System.out.println(stack1.denque());
        stack1.enque(4);
    }
}
