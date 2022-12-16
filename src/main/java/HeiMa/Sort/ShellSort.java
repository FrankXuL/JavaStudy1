package HeiMa.Sort;

/**
 * @title: ShellSort
 * @Author Xu
 * @Date: 8/12/2022 下午 2:43
 * @Version 1.0
 */
@SuppressWarnings("all")
public class ShellSort {
    public static void shell(int[] array){
        int gap = array.length;
        while (gap > 1){
            gap /= 2;
            for(int i = gap; i < array.length; i++){
                int tmp = array[i];
                int j = i - gap;
                while (j >= 0){
                    if(array[j] > tmp){
                        array[j + gap] = array[j];
                    }else{
                        break;
                    }
                    j -= gap;
                }
                array[j + gap] = tmp;
            }
        }
    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}