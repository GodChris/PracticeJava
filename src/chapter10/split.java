package chapter10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = input.nextLine();
        System.out.println("请输入分隔符：");
        String regex = input.nextLine();
        String[] result = split(s, regex);
        for (int index = 0; index < result.length; index++) {
            String word = result[index];
            System.out.print(word);
        }
    }

    public static String[] split(String s, String regex) {

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        String[] words = p.split(s);

        if (words.length > 0) {
            int count = 0;
            while (count < words.length) {
                if (m.find()) {
                    words[count] += m.group();
                }
                count++;
            }
        }
        return words;
    }
}
