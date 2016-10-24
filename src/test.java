/**
 * Created by God of Chris on 2016/10/9 0009.
 */
public class test {
    public static void main(String[] args){
        int n=6;
        int i;
        int j;
        int k=1;

        for(j=1;j<7;j++)
        {
            for(i=1;i<=7-n;i++)
            System.out.printf("%-2d",i);
            for(i=1;i<n+3;i++)
                System.out.printf("  ");
            for(i=1;i<=n;i++)
                System.out.printf("%-2d",i);
            for(i=1;i<10-n;i++)
                System.out.printf("  ");
            for(i=1;i<n;i++)
                System.out.printf("  ");

            for(i=1;i<=7-n;i++)

            { System.out.printf("%2d",k);
                k--;}
            for(i=1;i<10-n;i++)
                System.out.printf("  ");
            for(i=1;i<=n;i++)
                System.out.printf("%2d",i);
            System.out.printf("\n");
            n--;
            k=j+1;
        }

    }
}
