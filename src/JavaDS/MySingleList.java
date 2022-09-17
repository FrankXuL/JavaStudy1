package JavaDS;

/**
 * @title: MySingleList
 * @Author Xu
 * @Date: 2022/9/15 19:45
 * @Version 1.0
 */
@SuppressWarnings("all")
public class MySingleList {
    private ListNode head;

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
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

    //展示链表
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.println(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //从某个结点开始输出链表
    public void display(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清空链表
    public void clear() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode cur = new ListNode(data);
        cur.next = this.head;
        this.head = cur;
    }


    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) throws Exception {
        if (index < 0 || index > size()) {
            throw new Exception("index位置不合法");
        }
        if (index == 0) {
            addFirst(data);
        }
        if (index == size()) {
            addLast(data);
        }
        ListNode cur = findIndexSubOne(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }

    //找出下标为index的结点
    private ListNode findIndexSubOne(int index) {
        ListNode cur = this.head;
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.value == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.value == key) {
            this.head = this.head.next;
            return;
        }
        //找到要删除结点的前驱结点
        ListNode cur = findPrevOfKey(key);
        if (cur == null) {
            System.out.println("没有要删除的结点");
            return;
        }
        cur.next = cur.next.next;
    }

    //找出值为key的结点的前驱结点
    private ListNode findPrevOfKey(int key) {
        ListNode cur = this.head;
        while (cur.next != null) {
            if (cur.next.value == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while (cur != null) {
            if (cur.value == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.value == key) {
            this.head = this.head.next;
        }
    }

    //翻转链表
    public ListNode reverseList() {
        if (this.head == null) {
            return null;
        }
        if (this.head.next == null) {
            return this.head;
        }
        ListNode cur = this.head.next;
        this.head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    //找出结点的中间结点
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //找出第k个结点
    public ListNode findKthToTail(int k) {
        if (k <= 0 || this.head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k - 1 != 0) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}