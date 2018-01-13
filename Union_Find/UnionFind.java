import java.util.*;


class UnionFind{

    int[] union;
    int[] size;
    int[] maxeles;

    public UnionFind(int N){
        union = new int [N];
        size = new int [N];
        maxeles = new int [N];
        for(int i=0;i<N;i+=1){
            union[i] = i;
            size[i] = 1;
            maxeles[i] = i;
        }
    }

    private int root(int i){
        while(i!=union[i]){
            union[i]= union[union[i]];
            i = union[i];

        }
        return i;
    }

    public void union(int p,int q){
        int pid = root(p);
        int qid = root(q);
        if(maxeles[pid]>maxeles[qid]){
            maxeles[qid] = maxeles[pid];
        }else{
            maxeles[pid] = maxeles[qid];

        }
        if(pid==qid) return;
        if(size[pid]>size[qid]){
            union[qid]=pid;
            size[pid] = size[pid]+size[qid];
        }else{
            union[pid] =qid;
            size[qid] = size[pid]+size[qid];
        }



    }
    public boolean conected(int p, int q){
        return (root(p)==root(q) );
    }

    public int find(int p){
        return maxeles[root(p)];
    }

    public static void main (String[] args) {

        UnionFind a = new UnionFind(10);
        a.union(0,2);
        a.union(1,0);
        a.union(3,1);
        a.union(5,6);
        a.union(5,7);
        a.union(7,0);
        System.out.println( a.find(0) );
    }
}