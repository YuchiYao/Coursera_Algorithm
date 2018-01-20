import java.util.Arrays;

public class Intersection {
    /*
    Intersection of two sets. Given two arrays 𝚊[] and 𝚋[], each containing n
    distinct 2D points in the plane, design a subquadratic algorithm to count
    the number of points that are contained both in array 𝚊[] and array 𝚋[].
    */

    /*Solution: Design a sort algorithm.
      The best way is to sort first. (nlogn)
      compare : O(n)
      Time: O(nlogn)
      space: O(n)
     */
    class Coordination implements Comparable{
        int x,y;
        public Coordination(int x, int y){
            this.x = x;
            this.y = y;
        }
        int getX(){
            return x;
        }

        int getY(){
            return y;
        }

        @Override
        public int compareTo(Object o) {
            Coordination a = ((Coordination) o);
            if (x > a.x){
                return 1;
            }else if(x < a.x){
                return -1;
            }else{
                if (y > a.y){
                    return 1;
                }else if (y < a.y){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
    Coordination[] a = {new Coordination(5,3),new Coordination(3,5),
            new Coordination(7,9), new Coordination(2,4)};
    Coordination[] b = {new Coordination(3,5),new Coordination(2,7),
            new Coordination(1,9), new Coordination(5,3)};

    public int count(){
        Arrays.sort(a);
        Arrays.sort(b);
        int number = 0;
        int j =0,i=0;
        while(j<b.length && i<a.length) {
            if (a[i].compareTo(b[j]) > 0) {
                j += 1;
            } else if (a[i].compareTo(b[j]) < 0) {
                i += 1;
            } else {
                number += 1;
                i+=1;
            }
        }
        return number;

    }
    public static void main(String args[]){
        Intersection a = new Intersection();
        System.out.println(a.count());

    }


}
