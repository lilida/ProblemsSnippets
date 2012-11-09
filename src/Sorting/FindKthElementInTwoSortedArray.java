package ProblemsSnippets.Sorting;

import ProblemsSnippets.Heap.MaxHeapTest;

public class FindKthElementInTwoSortedArray {

    public static int findKthElement(int[] a, int[] b, int k){
        assert(a!=null&&b!=null &&k>0 && k<=a.length+b.length);

        return findHelper(a,0,b,0,k);
    }

    public static int findHelper(int[] a, int aIndex, int[] b, int bIndex, int k){
        if (a.length == 0) return b[bIndex+k-1];
        if (b.length == 0) return a[aIndex+k-1];
        if (k==1){
            if (a[aIndex]>b[bIndex])
                return aIndex == 0? b[bIndex]: Math.max(a[aIndex-1],b[bIndex]);
            else if (a[aIndex]<b[bIndex])
                return bIndex == 0 ? a[aIndex] : Math.max(b[bIndex-1],a[aIndex]);
            else
                return a[aIndex];

        }
        int searchAIndex = Math.min(a.length-1,aIndex+k/2);
        int searchBIndex = Math.min(b.length-1,bIndex+k/2);

        if (a[searchAIndex]>b[searchBIndex])  {
            return searchBIndex==b.length-1 ? a[aIndex+k-1-(b.length-bIndex)] : findHelper(a,aIndex,b,searchBIndex,k-(searchBIndex-bIndex));
        }
        else if (a[searchAIndex]==b[searchBIndex]){
              if (k%2==0){
                  return Math.max(a[searchAIndex-1],b[searchBIndex-1]);
              }
              else{
                 return a[searchAIndex];
              }
        }
        else
            return searchAIndex==a.length-1? b[bIndex+k-1-(a.length- aIndex)] : findHelper(a,searchAIndex,b,bIndex,k-(searchAIndex-aIndex));


    }
}
