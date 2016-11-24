package chapter9;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by God of Chris on 2016/11/8 0008.
 */
public class calender_apply {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println("当前日期为: " +
                calendar.get(GregorianCalendar.YEAR)+"年 "+
                (calendar.get(GregorianCalendar.MONTH)+1)+"月 "+
                calendar.get(GregorianCalendar.DAY_OF_MONTH)+"日");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入long型毫秒数：");
        long date=input.nextLong();
        calendar.setTimeInMillis(date);
        System.out.println("当前日期为: " +
                calendar.get(GregorianCalendar.YEAR)+"年 "+
                (calendar.get(GregorianCalendar.MONTH)+1)+"月 "+
                calendar.get(GregorianCalendar.DAY_OF_MONTH)+"日");
    }

}
