package tw.org.iii.tutor;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int num = 52;
		int[] poker = new int[num];
		for (int i = 1; i < poker.length; i++)
			poker[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=>poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;

		}
		//for (int v : poker)System.out.println(v);
		//System.out.println("---------");

		int[][] players = new int[4][13];
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
			       //第幾家 //第幾張
		}
		
		String[] color = {"黑桃","紅心","方塊","梅花"};   //宣告直接初始化,事先定義
		String[] value = {"A","2","3","4","5","6","7","8","9","10",
				"J","Q","K"};
		for (int[] player : players) {
			Arrays.sort(player);  //排序
			for (int card : player) {
				
				
				System.out.printf("%s%s ",color[card/13],value[card % 13]);
			}
			System.out.println();
		}
		
	}
}
