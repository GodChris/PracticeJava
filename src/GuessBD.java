import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/8 0008.
 */
public class GuessBD {
    public static void main(String[] args){

        String	set1=
                        "1  3  5  7\n"+
                        "9  11 13 15\n"+
                        "17 19 21 23\n"+
                        "25 27 29 31";

        String	set2=
                        "2  3  6  7\n"+
                        "10 11 14 15\n"+
                        "18 19 22 23\n"+
                        "26 27 30 31";

        String	set3=
                        "4  5  6  7\n"+
                        "12 13 14 15\n"+
                        "20 21 22 23\n"+
                        "28 29 30 31";

        String	set4=
                        "8  9  10 11\n"+
                        "12 13 14 15\n"+
                        "24 25 26 27\n"+
                        "28 29 30 31";

        String	set5=
                        "16 17 18 19\n"+
                        "20 21 22 23\n"+
                        "24 25 26 27\n"+
                        "28 29 30 31";

        int day=0;
        int i=1;
        double result = 0;
        Scanner input=new Scanner(System.in);
        String[] bdarr={set1,set2,set3,set4,set5};

        while(i<6){
            System.out.println("Is your birthday in set "+i+"?");
            System.out.println(bdarr[i-1]);
            System.out.print("Enter 0 for No and 1 for Yes: ");
            int answer=input.nextInt();

            if(answer==1)
                result= Math.pow(2,i-1);
            day+=result;
            i++;}

        {
            System.out.println("Hey Girl,Your birthday is " + day +"!"+"Marry Me!");}
    }
}
