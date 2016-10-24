/**
 * Created by God of Chris on 2016/10/9 0009.
 */
import java.util.*;
public class Calendar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the year:");
        int year = input.nextInt();
        //is leap year
        Boolean isLeap;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            isLeap = true;
        }else{
            isLeap = false;
        }

        System.out.print("Please input the day of this year's first day:");
        int day = input.nextInt();


        //the daies of every month
        int[] dayOfMonth;
        if (isLeap) {
            dayOfMonth = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        }else{
            dayOfMonth = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        }

        //the month's name
        String[] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        int count = 0;
        int days = 0;
        for (int j = 0; j < 4; j++) {

            System.out.print("\n");

            //monthes and weeks
            printMonthesAndWeeks(monthName[count],monthName[count+1],monthName[count+2],year);
            //the every line of the monthes
            for (int i = 0; i <= 5; i++) {
                System.out.print("\n");
                //the every line of the first month
                printTheLineOfMonth(7*i - (day + dayOfMonth[count] + days)%7 + 1,dayOfMonth[count + 1]);
                //the every line of the Second month
                printTheLineOfMonth(7*i - (day + dayOfMonth[count] + dayOfMonth[count + 1] + days)%7 + 1,dayOfMonth[count + 2]);
                //the every line of the thrid month
                printTheLineOfMonth(7*i - (day + dayOfMonth[count] + dayOfMonth[count + 1] + dayOfMonth[count + 2] + days)%7 + 1,dayOfMonth[count + 3]);
            }

            //compute the daies which have printed
            days += dayOfMonth[count] + dayOfMonth[count + 1] + dayOfMonth[count + 2];

            //the count to use the month name array
            count += 3;
        }
    }


    //the mothed to print every line of every month
    public static void printTheLineOfMonth(int a,int z){
        for (int i = 0; i <= 6; i++) {
            if (i + a <= z && i + a > 0) {
                System.out.printf("%6d",i + a);
            }else{
                System.out.printf("%6s"," ");
            }
        }
        System.out.printf(" | ");
    }


    //the mothed to print the month name and the week name
    public static void printMonthesAndWeeks(String a,String b,String c,int year){
        String[] weeks = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.printf("%24s " + year,a);
        System.out.printf("%40s " + year,b);
        System.out.printf("%40s " + year + "\n",c);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%6s",weeks[j]);
            }
            System.out.printf(" | ");
        }

    }
}