package JavaDS;

/**
 * @title: MySingleList
 * @Author Xu
 * @Date: 2022/9/15 19:45
 * @Version 1.0
 */
public class MySingleList<E> {
    private ListNode head;

    static class ListNode<E> {
        E value;
        ListNode next;

        public ListNode(E value) {
            this.value = value;
        }
    }

    public MySingleList(ListNode head) {
        this.head = head;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {

    }

    public void clear() {

    }

    //头插法
    public void addFirst(E data) {
        ListNode<E> cur =new ListNode<>(data);

    }


    //尾插法
    public void addLast(int data) {

    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        return true;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        return true;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {

    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }

}