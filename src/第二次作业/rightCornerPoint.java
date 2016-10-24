package 第二次作业;

import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/21 0021.
 */
public class rightCornerPoint {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Please input the amount of points: ");
        int x=input.nextInt();
        double[][] p=new double[x][2];
        System.out.print("Please Enter "+p.length+" points: ");
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[i].length;j++){
                p[i][j]=input.nextDouble();
            }
        }
        double[] point = getRightmostLowestPoint(p);
        System.out.println("The rightmost lowest point is (" +
                point[0] + ", " + point[1] + ")");
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        int rightMostIndex = 0;
        double rightMostX = points[0][0];
        double rightMostY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (rightMostY > points[i][1]) {
                rightMostY = points[i][1];
                rightMostIndex = i;
            }
            else if (rightMostY == points[i][1] && rightMostX < points[i][0]) {
                rightMostX = points[i][0];
                rightMostIndex = i;
            }
        }

        return new double[]{points[rightMostIndex][0], points[rightMostIndex][1]};
    }
}
