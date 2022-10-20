package JavaDS;

/**
 * @title: MyHashMap
 * @Author Xu
 * @Date: 18/10/2022 下午 10:23
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class MyHashBuck {
    static class Node{
        public int key;
        public int val;
        public Node next;
        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    public  Node[] array;
    public  int usedsize;
    public MyHashBuck(){
          array = new Node[8];
    }
    public void  put(int key ,int value){
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null){
            if(cur.key == key){
                cur = cur.next;
            }
        }
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        usedsize++;
    }

}