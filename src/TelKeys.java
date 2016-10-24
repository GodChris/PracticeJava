import java.util.*;
public class TelKeys {
    public static void main (String[] args){
        System.out.println("Please input a letter:");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        char letter = a.charAt(0);
        int i = 2;
        if (letter >= 'a' && letter <= 'r' || letter >='A' && letter <= 'R') {
            for (char start = 'a'; start <= 'r'; i++, start+=3) {
                if (letter >= start && letter <= start + 2 || letter >= start - 32 && letter <= start - 30) {
                    System.out.println("The nimber is "+i);
                }
            }
        }else if (letter == 's' || letter == 'S') {
            System.out.println("The nimber is "+7);
        }else if (letter >= 't' && letter <= 'v' || letter >= 'T' && letter <= 'V') {
            System.out.println("The nimber is "+8);
        }else if (letter >= 'w' && letter <= 'z' || letter >= 'W' && letter <= 'Z') {
            System.out.println("The nimber is "+9);
        }else {
            System.out.println(letter + "is an invalid input!");
        }
    }
}