package 第二次作业;
import java.util.Scanner;

/**
 * Created by God of Chris on 2016/10/21 0021.
 */
public class testEqual {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input the rows and cols of the matrix: ");
        int rows=input.nextInt();
        int cols=input.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Please enter the matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.print(isConsecutiveFour(matrix));
    }
    public static boolean isConsecutiveFour(int[][] values){
        int count =1;boolean flag=false;
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length-1;j++)
            if(count%4==0){
                flag=true;
                break;
            }else{
                if(values[i][j+1]==values[i][j]){
                    count++;
                    continue;
                }else
                    count=1;
            }
        }
        if(count%4==0){
            flag=true;}
        else{ count=1;flag=false;
            for(int m=0;m<values[0].length;m++) {
            for (int n = 0; n < values.length - 1; n++)
                if (count % 4 == 0) {
                    flag = true;
                    break;
                }else{
                if (values[n + 1][m] == values[n ][m]) {
                    count++;
                    continue;
                }else
                    count=1;
        }
        }
        if(count%4==0){
            flag=true;}
            else{count=1;int indexI=0;int indexJ=0;flag=false;
            for(int a=0;a<values.length-3;a++){
                for(int b=0;b<values[a].length-3;b++)
                    if (count % 4 == 0) {
                        flag = true;
                        break;
                    }else{
                        indexI=a;indexJ=b;
                        while(values[indexI][indexJ]==values[indexI+1][indexJ]+1&&
                               indexI<values.length-1&&indexJ<values[a].length-1 )
                        {
                            count++;
                            indexI+=1;indexJ+=1;
                        }
                    }
            }
            if(count%4==0){
                flag=true;
            }
        }
        }
        return flag;
    }
}
