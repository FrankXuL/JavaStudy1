package JavaDS;

/**
 * @title: MyLinked
 * @Author Xu
 * @Date: 2022/9/21 19:08
 * @Version 1.0
 */
public class MyLinkedList {
    static class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode tail;

    //头插法
    public void addFirst(int data) {
        ListNode cur = new ListNode(data);
        if (this.head == null) {
            this.head = cur;
            this.tail = cur;
            return;
        }
        cur.next = this.head;
        this.head.prev = cur;
        head = cur;
    }

    //尾插法
    public void addLast(int data){
        ListNode cur = new ListNode(data);
        if (this.head == null) {
            this.head = cur;
            this.tail = cur;
            return;
        }

    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data){
        return false;
    }

    private ListNode FindIndexNode(int index){
        ListNode cur = head;
        while(cur != null){

        }
        return null;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){

    }

    //删除所有值为key的节点
    public void removeAllKey(int key){

    }

    //得到单链表的长度
    public int size(){
        return -1;
    }

    public void display(){

    }

    public void clear(){
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.head = null;
        this.tail = null;
    }
}