import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/9 0009.
 */
public class GreatPyramid {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入打印的金字塔行数：");
        int m=input.nextInt();
        int n=m-1;int i,j;
        int k=1;

        for(j=1;j<m+1;j++)
        {
            for(i=0;i<=n;i++)
            System.out.print("    ");

            for(i=0;i<m-n;i++)
                System.out.printf("%4d",(int)Math.pow(2,i));
            for(i=0;i<(m-1-n);i++)

            {
                System.out.printf("%4d",(int)Math.pow(2,k-1));
                k--;
            }

            for(i=0;i<=n;i++)
                System.out.print("    ");
            System.out.print("\n");
            n--;
            k=j;
        }



    }
}
