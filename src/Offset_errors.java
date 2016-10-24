/**
 * Created by God of Chris on 2016/10/9 0009.
 */
public class Offset_errors {
    public static void main(String[] args){
        int n;double sum1=0;double sum2=0;
        for(n=1;n<=50000;n++){
            sum1+=1.0/n;
        }
        for(n=50000;n>0;n--){
            sum2+=1.0/n;
        }
        System.out.println("从大往小相加结果为:"+sum2);
        System.out.println("从小往大相加结果为:"+sum1);
        if(sum2>sum1){
            System.out.println("由此可知，从大到小相加结果更为精确");
        }

    }
}
