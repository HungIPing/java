package tw.org.iii.tutor;

public class Brad02 {
/*
 * byte、short、int運算結果會擺在int   搭配long的話就要擺long
 */
	public static void main(String[] args) {
		short var1 = 12;
		short var2 = 14;
		int var21 = var1+ var2;
		System.out.println(var21);
        byte var3 = 12;
        byte var4 = 13;
        byte var22 = (byte)(var3 + var4);  /*轉換資料型態，但有可能喪失精度*/
        System.out.println(var22);
        byte a = 127;
        a++;
        System.out.println(a);
        
	}

}
