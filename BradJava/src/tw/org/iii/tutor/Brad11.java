package tw.org.iii.tutor;

public class Brad11 {
//default放中間，程式會先跑case，比對完都沒有才會跑default
//少了break，程式若有符合，會先印出，後續就不比對，有印出就印
	public static void main(String[] args) {
		int a = 1;
		
		switch(a) {
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		case 100:
			System.out.println("C");
			break;
		default:
			System.out.println("X");
			break;
		}
        System.out.println("Game OVER");
	}

}
