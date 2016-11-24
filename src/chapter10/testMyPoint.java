package chapter10;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class testMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10.0, 30.5);
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint.distance(p1, p2));
    }
}
