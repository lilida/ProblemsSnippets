package ProblemsSnippets.Misc;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? 
 * 
 * Find all unique triplets in the array which gives the sum of zero.
 *
 *
 */

public class Problem3Sum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        assert(num!=null && num.length>3);

        HashSet<Pair<Integer,Integer>> triplets=new HashSet<Pair<Integer, Integer>>();

        for (int i=0;i<num.length;i++)
        {
            ArrayList<ArrayList<Integer>> twoResults = twoSum(num, 0-num[i],i+1);
            for (ArrayList<Integer> list:twoResults)
            {
                Pair<Integer,Integer> pair=new Pair<Integer, Integer>(list.get(0),list.get(1));
                if (!triplets.contains(pair))
                {
                    triplets.add(pair);
                }
            }


        }
        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
        for (Pair<Integer,Integer> p : triplets)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(p.fst);
            list.add(p.snd);
            list.add(0-p.fst-p.snd);
            ret.add(list);
        }
        return ret;
    
    }



    public ArrayList<ArrayList<Integer>> twoSum(int[] num, int sum, int startIndex){
        HashSet<Integer> set=new HashSet<Integer>();
        ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
        for (int i=startIndex;i<num.length;i++)
        {
                if (set.contains(sum - num[i]))
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(sum-num[i]);
                    ret.add(list);

                }

                if (!set.contains(num[i]))
                    set.add(num[i]);

        }
        return ret;
    }
}
