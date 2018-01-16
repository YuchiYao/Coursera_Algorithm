
public class BitonicArray {
    /*&
        Question:
        Search in a bitonic array. An array is bitonic if it is comprised of an increasing sequence
        of integers followed immediately by a decreasing sequence of integers. Write a program
        that, given a bitonic array of n distinct integer values, determines whether a given integer
        is in the array.

        Solution : Find the turning point
     */
    static int findPeekIndex(int[]data,int start, int end){
        int mid = (start + end )/2;
        if(start == end ){
            return mid;
        }
        else if(data[mid]<data[mid+1]){
            return findPeekIndex(data,mid+1,end);
        }else{
            return findPeekIndex(data,start,mid);
        }
    }
    static boolean find(int[]data, int peek, int val){
        return bstgetIndex(data,0,peek,val)||bstgetIndex(data,peek,data.length-1,val);
    }

    static boolean bstgetIndex(int[]data,int start, int end,int val){
        int midIndex = (start+end)/2;
        if(data[midIndex]==val){
            return true;
        }
        if(start>end){
            return false;
        }
        if (data[midIndex]>val){
            return bstgetIndex(data,start,midIndex-1,val);
        }else{
            return bstgetIndex(data,midIndex+1,end,val);
        }

    }

    public static void main(String args[]){
        int [] input = {1,5,7,8,9,12,7,5,4,2,0};
        int peek = BitonicArray.findPeekIndex(input,0,input.length-1);
        System.out.println(BitonicArray.find(input,peek,520));
    }
}
