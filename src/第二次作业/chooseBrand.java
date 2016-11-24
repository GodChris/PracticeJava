package 第二次作业;
/**
 * Created by God of Chris on 2016/10/17 0017.
 */
public class chooseBrand {
    public static void main(String[] args) {
        int[]deck=new int[52];
        //Spades:黑桃，Hearts:红桃，Diamond:方块，Clubs:梅花
        String[]suits={"Spades","Hearts","Diamond","Clubs"};
        int[]ranks={1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0;i<deck.length;i++)
            deck[i]=i;

        int count=0;
        for(int k=0;k<1000;k++){
            System.out.println("第"+(count+1)+"次选牌：");
        for(int i=0;i<deck.length;i++){
            int index=(int)(Math.random()*deck.length);
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }
            int total=0;
        for(int i=0;i<4;i++){
            //牌的花色
            String suit=suits[deck[i]/13];
            //具体那张牌
            int rank=ranks[deck[i]%13];
            total+=rank;
            System.out.println("Card number "+deck[i]+":"+rank+" of "+suit);
            }
            System.out.print("\n");
            count++;
            if(total==24){
                    System.out.println("这是第"+count+"次选到四张牌的和为24");
                break;
                }
    }
    }
}
