package ProblemsSnippets.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindCombinations {

    public ArrayList<ArrayList<Integer>> FindCombinations(int target, int[] numbers){
        return FindHelper(target,numbers,numbers.length-1);

    }

    public ArrayList<ArrayList<Integer>> FindHelper(int target, int[] numbers, int endIndex){

        if (endIndex<0)
            return new ArrayList<ArrayList<Integer>> ();
        int i=0;
        ArrayList<ArrayList<Integer>>  result = new ArrayList<ArrayList<Integer>> ();
        int value=target;
        while(value>0){
            value = target - i*numbers[endIndex];
            if (value == 0){
                ArrayList<Integer> tmp=new ArrayList<Integer>();
                for(int j=0;j<i;j++)
                    tmp.add(numbers[endIndex]);

                result.add(tmp);
            }
            else{
                ArrayList<ArrayList<Integer>> subResult = FindHelper(value,numbers,endIndex-1);
                if ( subResult.size()>0){
                    for(ArrayList<Integer> list:subResult){
                        for(int j=0;j<i;j++)
                            list.add(numbers[endIndex]);

                        result.add(list);
                    }
                }

            }
            i++;
        }
        return result;
    }
}
