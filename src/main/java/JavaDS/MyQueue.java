package JavaDS;

/**
 * @title: MyQueue
 * @Author Xu
 * @Date: 21/10/2022 下午 11:03
 * @Version 1.0
  */
@SuppressWarnings({"all"})
public class MyQueue {
    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode tail;
    public int usedSize;

    public void offer(int val) {
        ListNode node = new ListNode(val);
        if(head == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = tail.next;
        }
        usedSize++;
    }

    public int poll() {
        if(empty()) {
            return -1;
        }
        int ret = head.val;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        usedSize--;
        return ret;
    }

    public int peek() {
        if(empty()) {
            return -1;
        }
        return head.val;
    }

    public boolean empty() {
        return usedSize==0;
    }

    public int getUsedSize() {
        return usedSize;
    }

}