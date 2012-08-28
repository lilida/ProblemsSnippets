package ProblemsSnippets.Heap;


import ProblemsSnippets.Heap.MaxHeap;

public class MaxHeapTest extends junit.framework.TestCase {
    public void testMaxHeapify() throws Exception {
       MaxHeap heap=new MaxHeap();
       int[] array=new int[]{2,3,4,1,9,10};
       heap.maxHeapify(array,2);
       assertEquals(array[2],10);
       heap.maxHeapify(array,1);
       assertEquals(array[1],9);
    }

    public void testBuildHeap() throws Exception {
        MaxHeap heap=new MaxHeap();
        int[] array=new int[]{2,3,4,1,9,10};
        heap.buildHeap(array);
        assertEquals(array[0],10);
    }

    public void testHeapSort() throws Exception {

        MaxHeap heap=new MaxHeap();
        int[] array=new int[]{2,3,4,1,9,10};
        heap.heapSort(array);
        int[] sorted = new int[] {1,2,3,4,9,10};
        for (int i=0;i<sorted.length;i++)
            assertEquals(array[i],sorted[i]);


    }
}
