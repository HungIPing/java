package tw.org.iii.tutor;

public class Brad99 {

	public static void main(String[] args) {
		final int START = 2;
		final int ROWS = 3; //行
		final int COLS = 5;//列
		
		
		
		for (int k = 0; k < ROWS; k++) {   //這裡k是第幾圈
			for (int j = 1; j <= 9; j++) {
				for (int i = START; i <= (START+COLS-1); i++) {
					int newi = i + k*COLS;   //k=1時(在第二列)，第二列與第一列差4
					int r = newi * j;
					System.out.printf("%d x %d =%d\t", newi, j, r);

				}
				System.out.println();
			}
			System.out.println("------------");
		}
		
	}

}


