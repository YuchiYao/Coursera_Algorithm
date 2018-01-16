import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Sum3 {
    /*
        3-SUM in quadratic time.
        Design an algorithm for the 3-SUM problem that takes time proportional to n2 in the worst case.
        You may assume that you can sort the n integers in time proportional to n2 or better
     */
    /*
        Idea: The first number is go through the N element and the other two start at both sides of the
        List based on the the sum of these three numbers to find when it comes to zero
     */

    static void findSolution(List <Integer>input){
        Collections.sort(input);
        for(int i= 0; i< input.size()-2;i+=1){
            int j= i+1;
            int k= input.size()-1;
            while(j<k){
                int sum = input.get(i)+input.get(j)+input.get(k);
                if(sum==0){
                    System.out.println(input.get(i)+"+"+input.get(j)+"+"+input.get(k)+"=0");

                }
                if(sum<0){
                    j+=1;
                }else{
                    k-=1;
                }
            }

        }
    }

    public static void main(String args[]){
        ArrayList data = new <Integer>ArrayList();
        data.add(-5);
        data.add(-2);
        data.add(18);
        data.add(4);
        data.add(7);
        data.add(-10);
        Sum3.findSolution(data);
    }
}
