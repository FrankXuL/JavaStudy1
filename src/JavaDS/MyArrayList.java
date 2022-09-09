package JavaDS;

import java.util.Arrays;

/**
 * @title: MyArrayList
 * @Author Xu
 * @Date: 2022/9/9 20:07
 * @Version 1.0
 */
@SuppressWarnings("all")
public class MyArrayList<E> {
    private E[] value;
    private int usedsize;
    private static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.value = (E[]) new Object[DEFAULT_SIZE];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedsize; i++) {
            System.out.println(value[i] + " ");
        }
    }

    // 新增元素,默认在数组最后新增
    public void add(E data) {
        if (isFull()) {
            this.value =
                    Arrays.copyOf(this.value, this.value.length * 2);
        }
        this.value[usedsize] = data;
        usedsize++;
    }

    private boolean isFull() {
        return usedsize >= value.length;
    }

    // 在 pos 位置新增元素
    public void add(int pos, E data) throws Exception {
        if (isFull()) {
            add(data);
            return;
        }
        if (pos < 0 || pos > this.usedsize) {
            throw new Exception("pos添加位置不合法");
        }
        for (int i = this.usedsize - 1; i >= pos; i++) {
            this.value[i + 1] = this.value[i];
        }
        this.value[pos] = data;
        this.usedsize++;
    }

    // 判定是否包含某个元素
    public boolean contains(E toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if (value[i].equals(toFind)) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(E toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if (value[i].equals(toFind)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (usedsize == 0) {
            return true;
        }
        return false;
    }

    // 获取 pos 位置的元素
    public E get(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("表为空");
        }
        if (pos < 0 || pos > usedsize) {
            throw new Exception("下标不合法");
        }
        return this.value[pos];
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, E value) throws Exception {
        if (isEmpty()) {
            throw new Exception("表为空");
        }
        if (pos < 0 || pos > usedsize) {
            throw new Exception("更新位置不合法");
        }
        this.value[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(E toRemove) throws Exception {
        if (isEmpty()) {
            throw new Exception("表为空");
        }
        int index = indexOf(toRemove);
        if (index == -1) {
            throw new Exception("要删除的元素不存在");
        }

        for (int j = index; j < usedsize - 1; j++) {
            this.value[j] = this.value[j + 1];
        }
        this.usedsize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedsize;
    }

    // 清空顺序表
    public void clear() {
        for (int i = 0; i < this.usedsize; i++) {
            this.value[i] = null;
        }
        //this.value = (E[]) new Object[this.usedsize];
        usedsize = 0;
    }
}