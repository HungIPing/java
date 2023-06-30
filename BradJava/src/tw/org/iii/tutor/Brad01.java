package tw.org.iii.tutor;

public class Brad01 {
    /*
     * 變數規定第一個字[a-z A-Z $ _]    第二個字[a-z A-Z 0-9 $ _]  '*'代表前面出現0或多個
     * 變數盡量不要使用中文
     *byte 2的8次方   範圍 -128~127
     *short 2的16次方  範圍-32768~32767
     *int 2的32次方
     *long 2的64次方
     */
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {  //執行的意思
		byte var1;
		var1 = 123;
		System.out.println(var1);
        byte var2 = -128;
        System.out.println(var2);
        short $_$ = 200;
        System.out.println($_$);
        short var3 = 32767;
        System.out.println(var3);
        		
	}

}
