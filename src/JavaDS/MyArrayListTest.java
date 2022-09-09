package JavaDS;

/**
 * @title: MyArrayListTest
 * @Author Xu
 * @Date: 2022/9/9 21:03
 * @Version 1.0
 */
public class MyArrayListTest {
    public static void main(String[] args) throws Exception {
        MyArrayList<Integer>  myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.display();
        System.out.println(myArrayList.contains(2));
        myArrayList.set(1,6);
        myArrayList.display();
        myArrayList.clear();
        myArrayList.display();
    }
}