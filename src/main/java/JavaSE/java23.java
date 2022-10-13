package JavaSE;

/**
 * @title: Java23
 * @Author Xu
 * @Date: 2022/7/31 14:48
 * @Version 1.0
 */
public class java23 {
    public static void main(String[] args) {
        hanNuoTa(1,'A','B','C');
        System.out.println();
        hanNuoTa(2,'A','B','C');
        System.out.println();
        hanNuoTa(3,'A','B','C');
        System.out.println();
        hanNuoTa(4,'A','B','C');
        System.out.println();
    }
    public static void hanNuoTa(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
        } else {
            hanNuoTa(n - 1, pos1,pos3,pos2);
            move(pos1,pos3);
            hanNuoTa(n-1,pos2,pos1,pos3);
        }
    }
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }

}