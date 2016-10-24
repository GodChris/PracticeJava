import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/7 0007.
 */
public class RandomNum {
    public static void main(String[] args){
        Scanner scope =new Scanner(System.in);
        System.out.println("Please input left scope num:");/////左区间数
        int start=scope.nextInt();
        System.out.println("Please input right scope num:");/////右区间数
        int end=scope.nextInt();
        for(int x=0;x<5;x++){/////获取随机数，x随意设，此为获取5个随机数
            int num=getRandom(start,end);
            System.out.println(num);
        }
    }
    public static int getRandom(int start,int end){
        return (int)(Math.random()*(end-start+1))+start;
    }
}