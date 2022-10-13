package JavaDS;

import java.util.Arrays;

/**
 * @title: MyStack
 * @Author Xu
 * @Date: 2022/9/23 21:32
 * @Version 1.0
 */
public class MyStack {
    int[] array;
    int size;

    public MyStack() {
        array = new int[3];
    }

    public int push(int e) {
        ensureCapacity();
        array[size++] = e;
        return e;
    }

    public int pop() {
        int e = peek();
        size--;
        return e;
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("栈为空，无法获取栈顶元素");
        }
        return array[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return 0 == size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
    }
}