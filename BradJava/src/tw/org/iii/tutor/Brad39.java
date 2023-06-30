package tw.org.iii.tutor;

public class Brad39 {

	public static void main(String[] args) {
		int a = 10,b = 0;
		int[] c = new int[4];
		
		System.out.println("Hello,World");
		try{
			System.out.println(a / b);
			System.out.println("OK");
			System.out.println(c[2]);
			System.out.println(c[123]);
		}catch(ArithmeticException e) {
			System.out.println("Ooop!");
		}catch(RuntimeException e) {
			System.out.println("XXXX");
		}
		
		
		}
	}


