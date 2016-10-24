import java.util.Scanner;
/**
 * Created by God of Chris on 2016/10/7 0007.
 */
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grades = input.nextLine();

        String[] className = grades.split(",");

        String gradesArr[][];
        gradesArr = new String[39][];

        for (int i = 0; !grades.contains("TheEnd"); i++) {
            gradesArr[i] = new String[className.length];
            String[] gradesArr2 = grades.split(",");
            for (int j = 0; j < gradesArr2.length; j++) {
                gradesArr[i][j] = gradesArr2[j];
            }
            grades = input.nextLine();
        }
        System.out.println("每个学生的平均成绩为:");
        for (int i = 1; i < gradesArr.length; i++) {
            Double total = 0.0;
            for (int j = 1; j < gradesArr[i].length; j++) {
                total += Double.parseDouble(gradesArr[i][j]);
            }
            System.out.println("学生 " + gradesArr[i][0] + "的平均成绩为:" + (double) Math.round(total / (gradesArr[i].length - 1) * 100)/100);
        }

        System.out.println("每一科的平均成绩如下:");
        for (int i = 1; i < gradesArr[0].length; i++) {
            Double total = 0.0;
            for (int j = 1; j < gradesArr.length; j++) {
                total += Double.parseDouble(gradesArr[j][i]);
            }
            System.out.println(gradesArr[0][i] + "的平均成绩为:" + (double)Math.round(total/(gradesArr.length - 1)*100)/100);
        }
    }
}
