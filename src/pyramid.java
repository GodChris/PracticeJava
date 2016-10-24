/**
 * Created by God of Chris on 2016/10/1 0008.
 */
public class pyramid {
    public static void print1() {
        int i,j;
        ////第一个图形
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    public static void print2() {
        int a;
        int b;
        ////第二个图形
        for (a = 6; a >= 1; a--) {
            for (b = 1; a >= b; b++) {
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }
    }
    public static void print3() {
        int c;
        int d;
        ////第三个图形
        for (c = 1; c <= 6; c++) {
            for (d = (12 - 2 * c); d >= 1; d--) {
                System.out.print(" ");
            }
            for (d = c; d >= 1; d--) {
                System.out.print(d + " ");
            }
            System.out.print("\n");
        }
    }
    public static void print4() {
        int e;
        int f;
        ////第四个图形
        for (e = 6; e >= 1; e--) {
            for (f = (12 - 2 * e); f >= 1; f--) {
                System.out.print(" ");
            }
            for (f = 1; f <= e; f++) {
                System.out.print(f + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        print1();print2();print3();print4();
    }
}
