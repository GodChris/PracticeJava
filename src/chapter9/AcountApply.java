package chapter9;

/**
 * Created by God of Chris on 2016/11/11 0011.
 */
public class AcountApply {
    public static void main(String[] args) {
        Acount myAcount=new Acount(1122,20000);
        myAcount.setAnnualInterestRatet(0.045);
        myAcount.withdraw();
        myAcount.deposit();
        System.out.print("The MonthlyInterest of your account is "+myAcount.getMonthlyInterest()+"\n");
        myAcount.getDateCreated();
    }
}
