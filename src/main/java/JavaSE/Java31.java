package JavaSE;

/**
 * @title: Java31
 * @Author Xu
 * @Date: 2022/8/2 0:51
 * @Version 1.0
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Java31 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 4, 4};
        search(arr);
    }

    public static void search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp=0;
            for (int j = 0; j < arr.length; j++) {
                 if (arr[i] ==arr[j]){
                     tmp++;
                 }
            }
            if(tmp==1){
                System.out.println(arr[i]);
            }
        }

    }
}