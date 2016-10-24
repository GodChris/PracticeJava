import java.util.Scanner;

/**
 * Created by God of Chris on 2016/9/30 0030.
 */
public class transformer {
    public static void main(String[] args){
        System.out.println("Please input a string:");
        Scanner transe=new Scanner(System.in);
        String StrNum=transe.nextLine();
        System.out.println("please input the OriginalSystem:");
        int OriginalSystem=transe.nextInt();
        int decimal=Integer.parseInt(StrNum,OriginalSystem);
        System.out.println("please input the SwitchSystem:");
        int SwitchSystem=transe.nextInt();
        System.out.println("The String you input has been transformed "+"\n"+"输入的字符串:"+StrNum+"\n"+"十进制中间数:"+decimal+"\n"+"目标进制数:");
        DecimalSwitch(decimal,SwitchSystem);
    }
    public static void DecimalSwitch(int decimal,int SwitchSystem){
        String SwitchNum="";
        while(decimal!=0){
            int remainder=decimal%SwitchSystem;
            char digit=(remainder<=9 && remainder>=0)?
                    (char)(remainder+'0'): (char)(remainder-10+'A');
            SwitchNum=digit+SwitchNum;
            decimal=decimal/SwitchSystem;
        }
        System.out.println(SwitchNum);
    }
}
