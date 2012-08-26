package ProblemsSnippets.ProblemsSnippets;

/**
 * Implement a Max Heap per CLRS
 */
public class MaxHeap {
    public void maxHeapify(int[] array, int index){

        maxHeapify(array,index,array.length);
    }

    public void maxHeapify(int[] array, int index, int length){

        assert(array!=null && index<=length -1);

        int left=index*2+1;
        int right=index*2+2;
        int large = index;
        if (left<length && array[left]>array[large]){
            large=left;
        }
        if (right<length && array[right]>array[large]){
            large=right;
        }

        if (large != index){
            int temp =  array[index];
            array[index]=array[large];
            array[large]=temp;
            maxHeapify(array,large, length);
        }
    }


    public void buildHeap (int[] array){

        assert(array!=null);
        for (int i=(array.length-1)/2;i>=0; i--){
            maxHeapify(array,i);
        }
    }

    public void heapSort(int[] array){
        assert(array!=null);
        buildHeap(array);
        for (int i=array.length-1;i>0;i--){
            int temp=array[i];
            array[i]=array[0];
            array[0]=temp;
            maxHeapify(array,0,i);
        }
    }

}
