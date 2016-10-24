/**
 * Created by God of Chris on 2016/10/1 0008.
 */
public class PrimerNum {
    public static  void main(String[] args){
        final int NUMBER_OF_PRIMES=50;////显示50个素数
        final int NUMBER_OF_PER_LINE=10;////每行显示10个素数
        int count =0;////计数素数的个数
        int number=2;////
        System.out.println("The first 50 prime numbers are \n");
        while(count<NUMBER_OF_PRIMES){
            Boolean isPrime=true;
            for(int divisor=2;divisor<=number/2;divisor++){
                if(number%divisor==0){
                    isPrime=false;break;
                }
            }
            if(isPrime){
                count++;
                if(count%NUMBER_OF_PER_LINE==0){
                    System.out.printf("%-6d\n",number);////左对齐
                }
                else
                    System.out.printf("%-6d",number);
            }
            number++;
        }
    }
}
