import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/11 0011.
 */
public class eliminate {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int[] distinct=eliminateDuplicates(arr);
        System.out.print("The distinct numbers are: ");
        for(int e: distinct){
            System.out.print(e+" ");
        }
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] num=new int[10];
        System.out.print("Enter ten numbers:");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        int[] temp=new int[num.length];
        int k=0;
        for(int j=1;j<num.length;j++){
            if(num[j]!=num[0]){
                temp[k]= num[j];
                k+=1;
            }
        }
        int[] result=new int[k+1];
        result[0]=num[0];
        for(int m=1,n=0;n<k;m++,n++){
            result[m]=temp[n];
        }
        return result;
    }
}
