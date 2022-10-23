package JavaDS;

/**
 * @title: MyHashMap
 * @Author Xu
 * @Date: 18/10/2022 下午 10:23
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class MyHashBuck<K,V> {
    static class Node<K,V>{
        public K key;
        public V val;
        public Node next;
        public Node(K key,V val){
            this.key = key;
            this.val = val;
        }
    }

    public  Node[] array;
    public  int usedsize;
    private static final double LOAD_FACTOR = 0.75;
    private static final int DEFAULT_SIZE = 8;//默认桶的大小
    public MyHashBuck(){
          array = (Node<K,V>[])new Node[DEFAULT_SIZE];
    }
    public void  put(K key ,V val){
        int hashKey = key.hashCode();
        int index = hashKey % array.length;
        Node<K,V> cur = array[index];
        while (cur != null){
            if(cur.key.equals(key)){
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        Node<K,V> node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        usedsize++;
        if( loadFactor() >= 0.75) {
            resize();
        }
    }
    private void resize() {
        Node<K,V>[] newArray = new Node[2* array.length];
        for (int i = 0; i < array.length ; i++) {
            Node<K,V> cur = array[i];
            while (cur != null) {
                Node curNext = cur.next;
                int hashCur = cur.key.hashCode();
                int newIndex = hashCur % newArray.length;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }


    private double loadFactor() {
        return usedsize * 1.0 / array.length;
    }


    public V get(V key) {
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while (cur != null) {
            if(cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
}