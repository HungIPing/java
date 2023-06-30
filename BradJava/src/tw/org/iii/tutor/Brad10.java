package tw.org.iii.tutor;

public class Brad10 {

	public static void main(String[] args) {
		int  a = 10,b = 3;
		if (a++ <= 10 && b-- >= 3) {    //++在a的前面，先運算後判斷有無小於10
			                            //  &&只要有一邊是false，另一邊就不會運算，&兩邊都會運算
			System.out.printf("OK: a = %d,b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d,b = %d", a, b);

	    }
		System.out.println();
		System.out.println(3&2);
		System.out.println(3|2);
		System.out.println(3^2);
	}
}
