package 第二次作业;

import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/20 0020.
 */
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please input the i,j of matrix1: ");
        int x1=input.nextInt();int y1=input.nextInt();
        System.out.print("Please input the j of matrix2:");
        int y2=input.nextInt();

        //输入矩阵1
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[x1][y1];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }

        //输入矩阵2
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[y1][y2];
        for (int i = 0; i < matrix2.length; i++)
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }

        //矩阵相乘打印结果
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        System.out.println("\nThe multiplication of the matrices is ");
        printResult(matrix1, matrix2, resultMatrix, '*');

    }
    public static double[][] multiplyMatrix(double[][] a,double[][] b){
        double[][] c=new double[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for (int j = 0; j < c[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
    public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
        for (int i = 0; i <(( m1.length>=m2.length)?m1.length:m2.length); i++) {
            for (int j = 0; j < m1[0].length; j++)
                if(i<m1.length){
                System.out.print(" " + m1[i][j]);}
            else{
                    System.out.print("    ");
                }

            if (i == m1.length/2)
                System.out.print("  " + op + "  ");
            else
                System.out.print("     ");


            for (int a = 0; a < m2[0].length; a++)
                if(i<m2.length){
                System.out.print(" " + m2[i][a]);}
            else{
                    System.out.print("    ");
                }

            if (i == m1.length / 2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int b = 0; b < m3[0].length; b++)
                if(i<m3.length)
                System.out.print(" " + m3[i][b]);
            else
                System.out.print("  ");

            System.out.println();

        }
    }
}
