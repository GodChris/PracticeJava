import java.util.Scanner;
public class lottery {
    public static void main(String[] args){
        Scanner lottery =new Scanner(System.in);

        int real=(int)(Math.random()*1000);
        int number=real/10;
        int number1=number/10;
        int number2=number%10;
        int number3=real%10;
        System.out.println("Enter Your Lottery Pick(3numbers)：");
        int peoplenumber=lottery.nextInt();
        int peoplenumberzero=peoplenumber/10;
        int peoplenumber1=peoplenumberzero/10;
        int peoplenumber2=peoplenumberzero%10;
        int peoplenumber3=peoplenumber%10;


        if (number1==peoplenumber1&&number2==peoplenumber2&&number3==peoplenumber3){
            System.out.println("Congratulation!You get 10000 doller.");
        }

        else if ((number1==peoplenumber2&&number2==peoplenumber3&&number3==peoplenumber1)
                ||(number1==peoplenumber2&&number2==peoplenumber1&&number3==peoplenumber3)
                ||(number1==peoplenumber3&&number2==peoplenumber2&&number3==peoplenumber1)
                ||(number1==peoplenumber3&&number2==peoplenumber1&&number3==peoplenumber2)
                ||(number1==peoplenumber1&&number2==peoplenumber3&&number3==peoplenumber2)){
            System.out.println("Congratulation!You get 3000 doller.");
        }

        else if (number1==peoplenumber1||number1==peoplenumber2||number1==peoplenumber3
                ||number2==peoplenumber1||number2==peoplenumber2||number2==peoplenumber3
                ||number3==peoplenumber1||number3==peoplenumber2||number3==peoplenumber3) {
            System.out.println("Congratulation!You get 1000 doller.");
        }
        else {
            if(     number1!=peoplenumber1&&number1!=peoplenumber2&&number1!=peoplenumber3
                    &&number2!=peoplenumber1&&number2!=peoplenumber2&&number2!=peoplenumber3
                    &&number3!=peoplenumber1&&number3!=peoplenumber2&&number3!=peoplenumber3)

        {System.out.println("It's a pity that you didn't win the prize.");}
        else
        {System.out.println("Congratulation!You get 2000 doller.");}}

        {System.out.println("本期中奖数字为："+number1+number2+number3);}
    }
}
								