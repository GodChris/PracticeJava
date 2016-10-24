import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/7 0007.
 */
public class SuijiOperate {
    public static void main(String[] args){
        Scanner scope =new Scanner(System.in);
        System.out.println("Please input left scope num:");/////左区间数
        int start=scope.nextInt();
        System.out.println("Please input right scope num:");/////右区间数
        int end=scope.nextInt();
        System.out.println("The scope is ["+start+","+end+"]");
        int num1=(int)(Math.random()*(end-start+1))+start;
        int num2=(int)(Math.random()*(end-start+1))+start;
        char[] array={'+','-','*','/'};
        int result=0;
        switch (array[(int)(Math.random()*4)]){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num1==0||num2==0){
                    result=0;
                }else{
                    result=num1/num2;
                }
                break;
        }
        System.out.println("What is "+num1+array[(int)(Math.random()*4)]+num2+"?");

        int answer=scope.nextInt();
        System.out.println("Your answer "+"is"+" "+(result==answer));
    }
}
