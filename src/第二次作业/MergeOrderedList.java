import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/18 0018.
 */
public class MergeOrderedList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //输入两个有序列表，输入的第一个数为列表长度
        System.out.print("Enter list1: ");
        int x=input.nextInt();
        int[] arr1=new int[x];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=input.nextInt();
        }

        System.out.print("Enter list2: ");
        int y=input.nextInt();
        int[] arr2=new int[y];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=input.nextInt();
        }

        //result数组接受从方法返回的数组，并打印出来
        int[] result=merge(arr1,arr2);
        System.out.print("The merged list is: ");
        for(int e: result){
            System.out.print(e+" ");
        }
    }
    public static int[] merge(int[] list1,int[] list2){
        int[] list3=new int[list1.length+list2.length];
        for(int i=0;i<list1.length;i++){
            list3[i]=list1[i];
        }
        for(int j=list1.length;j<(list1.length+list2.length);j++){
            list3[j]=list2[j-list1.length];
        }
        //升序排序,选择排序法，比较list3.length次
        for (int i = 0; i < list3.length - 1; i++) {
            // 找到最小数
            int currentMin = list3[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list3.length; j++) {
                if (currentMin > list3[j]) {
                    currentMin = list3[j];
                    currentMinIndex = j;
                }
            }

            // 交换最小值当前下标
            if (currentMinIndex != i) {
                list3[currentMinIndex] = list3[i];
                list3[i] = currentMin;
            }
        }
        return list3;
    }

}
