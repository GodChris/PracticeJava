package 第二次作业;
import java.util.Scanner;


/**
 * Created by God of Chris on 2016/10/11 0011.
 */
public class delete {
    public static void main(String[] args){
        int[] arr=new int[10];
        int[] distinctArr=eliminateDuplicates(arr);
        System.out.print("The distinct numbers are: ");
        for(int e: distinctArr){
            System.out.print(e+" ");
        }
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] list1=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        for(int i=0;i<list1.length;i++){
            list1[i]=input.nextInt();}

        /*
        int[] result=new int[list1.length];////result数组已被初始化为0；
        int k=0;
        for(int i=0;i<list1.length;i++){
            int j=0;
            for(;j<=i&&list1[i]!=result[j];j++);
            if(j>i) result[k++]=list1[i];
        }
        */
        //创建一个result数组和list1数组一样
        int[] result=new int[list1.length];
        for(int i=0;i<list1.length;i++)
            result[i]=list1[i];
        //清空原数组
        for(int i=0;i<list1.length;i++)
            list1[i]=0;
        //设置下标
        int index=0;
        //用result数组填充原数组
        for(int i=0;i<result.length;i++,index++){
            list1[index]=result[i];

            //与之前的元素比较，如果存在，下标倒退1
            for(int j=0;j<index;j++)
                if(list1[index]==list1[j]){
                    list1[index]=0;
                    index--;
                    break;
                }
        }

        //返回list1下标0—index的数，存入distinct数组
        int[] distinct=new int[index];
        for(int i=0;i<distinct.length;i++){
            distinct[i]=list1[i];
        }
        return distinct;
    }
}