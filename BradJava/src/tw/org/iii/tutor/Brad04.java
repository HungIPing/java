package tw.org.iii.tutor;

public class Brad04 {
/*
 * float double 差在精確度
 * double => 10.123，要從float轉為double，要加f
 */
	public static void main(String[] args) {
        float var1 = 10.123456789f;
        double var2 = 10.123456789;
        System.out.println(var1);
        System.out.println(var2);
        
        double a = 10;
        double b = 0; /*這個0是很接近0的數字，並非0*/
        System.out.println(a / b);
	}

}
