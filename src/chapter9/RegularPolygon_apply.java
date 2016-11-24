package chapter9;

/**
 * Created by God of Chris on 2016/11/13 0013.
 */
public class RegularPolygon_apply {
    public static void main(String[] args) {
        RegularPolygon rp1=new RegularPolygon();
        RegularPolygon rp2=new RegularPolygon(6,4);
        RegularPolygon rp3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println("The first Regular Polygon：");
        System.out.println("The perimeters is "+rp1.getPerimeter()+"\n"+"The area is "+rp1.getArea()+"\n");

        System.out.println("The second Regular Polygon：");
        System.out.println("The perimeters is "+rp2.getPerimeter()+"\n"+"The area is "+rp2.getArea()+"\n");

        System.out.println("The third Regular Polygon：");
        System.out.println("The perimeters is "+rp3.getPerimeter()+"\n"+"The area is "+rp3.getArea());
    }
}
