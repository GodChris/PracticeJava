package chapter9;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by God of Chris on 2016/11/11 0011.
 */
public class Acount {
    //data field
    private int id;

    //store balance
    private double balance;

    ///store current insterestrate
    private double annualInterestRate;

    ///store the account opening date
    private Date dateCreated;

    //No arguments constructor
    public Acount(){
    }

    //arguments constructor
    public Acount(int id,double newbalance){
        this.id=id;
        balance=newbalance;
    }

    //accessor of id
    public int getId(){
        return id;
    }

    //accessor of balance
    public double getBalance(){
        return balance;
    }

    //accessor of annualInterestRate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //accessor of dateCreated
    public void getDateCreated(){
        Calendar calendar=Calendar.getInstance();
        System.out.println("The date of opening account is " +
                calendar.get(GregorianCalendar.YEAR)+"/"+
                (calendar.get(GregorianCalendar.MONTH)+1)+"/"+
                calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }

    //modifier of id
    public void setId(int id){
        id++;
        this.id = id;
    }

    //modifier of balance
    public void setBalance(double balance){
        this.balance=balance;
    }

    //modifier of annualIntereatRate
    public void setAnnualInterestRatet(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }

    public double getMonthlyInterest(){
        return (getMonthlyInterestRate()*balance);
    }

    public double withdraw(){
        System.out.print("How much money do you want to withdraw：");
        Scanner input=new Scanner(System.in);
        double money_w=input.nextDouble();
        balance=balance-money_w;
        System.out.println("The balance of your account now is "+balance);
        return balance;
    }

    public double deposit(){
        System.out.print("How much money do you want to deposit：");
        Scanner input=new Scanner(System.in);
        double money_d=input.nextDouble();
        balance+=money_d;
        System.out.println("The balance of your account now is "+balance);
        return balance;
    }
}
