import java.util.Arrays;
import java.util.Collections;

public class Permutation {

    /*
        Q:
        Permutation. Given two integer arrays of size n, design a subquadratic
        algorithm to determine whether one is a permutation of the other.
        That is, do they contain exactly the same entries but, possibly, in a different order.


        Solution: First, sort both of these two array. and then compare them.
        test case: {} {}, {1} {}, {1,5,8,2,4,8,2}  {5,8,2,8,2,1,4}
     */
    public static boolean compare(int []a, int []b){
        if(a.length!=b.length){
            return false;
        }else{
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i+=1){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]){

        int[] array1= {};
        int[] array2= {};
        System.out.println(compare(array1,array2));

    }


}
