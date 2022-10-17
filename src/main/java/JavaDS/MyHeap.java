package JavaDS;

import java.util.Arrays;

/**
 * @title: Heap
 * @Author Xu
 * @Date: 12/10/2022 下午 8:32
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class MyHeap {
    public int[] elem;

    public int usedSize;//有效的数据个数

    public static final int DEFAULT_SIZE = 10;

    public MyHeap() {
        elem = new int[DEFAULT_SIZE];
    }

    public void initElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            usedSize++;
        }
    }

    /**
     * 时间复杂度：O(n)
     */
    public void createHeap() {
        for (int parent = (usedSize - 1 - 1) / 2; parent >= 0; parent--) {
            //统一的调整方案
            shiftDown(parent, usedSize);
        }
    }

    private void shiftDown(int parent, int usedSize) {
        int child = 2 * parent + 1; //找到左孩子
        while (child < usedSize) {
            ////child+1保证有右孩子,如果右孩子比左孩子大的话需要调整的是右孩子
            if (child + 1 < usedSize && elem[child] < elem[child + 1]) {
                child++;
            }
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                //继续找该结点的孩子结点
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    public void offer(int val) {
        if (isFull()) {
            //扩容
            elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        this.elem[usedSize] = val;
        usedSize++;
        //想办法让他再次变成大根堆
        shiftUp(usedSize - 1);
    }

    private void shiftUp(int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {//parent >= 0
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return elem[0];
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }

    public void heapSort() {
        //1.建立大根堆 O(n)
        createHeap();
        //2.然后排序
        int end = usedSize - 1;
        while (end > 0) {
            int tmp = elem[0];
            elem[0] = elem[end];
            elem[end] = tmp;
            shiftDown(0, end);
            end--;
        }
    }

    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        int[] array = {1, 8, 5, 6, 9, 13, 15, 78, 65, 98};
        heap.initElem(array);
        for (int i = 0; i < heap.elem.length; i++) {
            System.out.print(heap.elem[i] + " ");
        }
        System.out.println();
        heap.createHeap();
        for (int i = 0; i < heap.elem.length; i++) {
            System.out.print(heap.elem[i] + " ");
        }
        System.out.println();
        heap.heapSort();
        for (int i = 0; i < heap.elem.length; i++) {
            System.out.print(heap.elem[i] + " ");
        }
    }
}