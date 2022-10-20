package JavaDS;

import java.util.Scanner;

/**
 * @Author Xu
 * @Date: 2022/9/8 22:31
 * DD5 进制转换
 */
@SuppressWarnings({"all"})
public class nowCoderDemo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        boolean flg = false;
        String table = "0123456789ABCDEF";
        StringBuilder ret = new StringBuilder();
        if(m == 0){
            ret.append("0");
        }
        if (m < 0) {
            m = -m;
            flg = true;
        }
        while (m != 0) {
            ret.append(table.charAt(m % n));
            m = m / n;
        }
        if (flg) {
            ret.append("-");
        }
        ret.reverse();
        System.out.println(ret);
    }
}