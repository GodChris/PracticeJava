package 第二次作业;
import java.util.Scanner;
/**
 * Created by God of Chris on 2016/10/11 0011.
 */
/*主要练习关于Arrays类的方法的使用较为简单*/
public class judgeArr {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("数组的长度是：");
        int x=input.nextInt();
        int[] list1=new int[x];
        System.out.print("输入数组1：");
        for(int i=0;i<list1.length;i++){
            list1[i]=input.nextInt();
        }
        int[] list2=new int[x];
        System.out.print("输入数组2：");
        for(int j=0;j<list2.length;j++){
            list2[j]=input.nextInt();
        }
        System.out.println("两数组内容相同返回true，不同返回false：");
        System.out.print("结果是："+equal(list1,list2));
    }
    public static boolean equal(int[] list1,int[] list2){
        ////调用选择排序的方法，先对数组排序，再判断内容是否相同
        arrSort(list1);
        arrSort(list2);
        ////返回结果
        if (list1==list2)
            return true;
        if (list1==null || list2==null)
            return false;

        int length = list1.length;
        if (list2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (list1[i] != list2[i])
                return false;

        return true;
    }
    public static void arrSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // 找到最小的数
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // 交换最小值当前下标
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}