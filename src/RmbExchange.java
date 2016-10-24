import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/5 0008.
 */
public class RmbExchange {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("已消费金额为：");
        double amount = input.nextDouble();

        int money=1000-(int)(amount*10);
        ////找钱
        double change=money/10.0;
        int rejiao=money/10;
        ////角的数量
        int amoutjiao=money%10;
        int wushiyuan=rejiao%50;
        ////五十元的数量
        int amountwushiyuan=rejiao/50;
        int ershiyuan=wushiyuan%20;
        ////二十元的数量
        int amountershiyuan=wushiyuan/20;
        int shiyuan=ershiyuan%10;
        ////十元的数量
        int amountshiyuan=ershiyuan/10;
        int wuyuan=shiyuan%5;
        ////五元的数量
        int amountwuyuan=shiyuan/5;
        System.out.println("应找金额为:"+change+"元");
        System.out.println("应找:"+amountwushiyuan +"张五十元面额；"+
                amountershiyuan+"张二十元面额；"+
                amountshiyuan +"张十元；"+
                amountwuyuan +"张五元；"+
                wuyuan+"张一元；"+
                amoutjiao+"枚一角。");
    }
}
