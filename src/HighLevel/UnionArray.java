package HighLevel;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
     int []a={1,2,3,4,5,6};
     int []b={4,5,6};

        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i< a.length-1;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i< b.length;i++)
        {
            set.add(b[i]);
        }
        System.out.println(set);
    }
}
