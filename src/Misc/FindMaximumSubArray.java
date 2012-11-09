package ProblemsSnippets.Misc;

public class FindMaximumSubArray {

    public int FindMaximumSubArray(int[] array){
        assert(array !=null && array.length>0);

        int maxSum=array[0];
        int sum=0;


        for(int i=0;i<array.length;i++){
            if (sum<0)
               sum=array[i];
            else
               sum+=array[i];

            if (sum>maxSum)
                maxSum=sum;

        }
        return maxSum;
    }
}
