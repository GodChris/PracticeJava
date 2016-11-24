package chapter10;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public  boolean isEven(int value) {
        return value % 2 == 0;
    }

    public  boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public  boolean isPrime(int value) {
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public  boolean isEven(MyInteger value) {
        return value.isEven();
    }

    public  boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    public  boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    public boolean equals(int value){
        return this.value==value;
    }

    public boolean equals(MyInteger value){
        return value.equals(this.value);
    }

    public static int parseInt(char[] c){
        return Integer.valueOf(new String(c));
    }

    public static int parseInt(String s){
        return Integer.valueOf(s);
    }

}