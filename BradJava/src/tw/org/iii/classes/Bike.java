package tw.org.iii.classes;

import java.io.Serializable;

public class Bike implements Serializable{
	public double speed; // 腳踏車擁有速度 物件變數 private只有本類別內可使用
	public String owner;
	
	//建構式/子/方法   寫了建構式，編譯器就不再幫忙
			//(所有類別都有建構式)
	public Bike(String name ) {
		System.out.println("Bike");
		owner = "default";  //初始化
	}
	
	public void upSpeed() { // void沒有傳回值 
		                    //加public變全域可以存取(沒有的話相同package可使用)
		speed = speed < 1 ? 1 : speed * 1.2; // 意思是小於1的話就是1，繼續採1.2加速上去
	}

	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5; 

	}

	public double getSpeed() {   //封裝speed
		return speed;

	}
	@Override    /*改寫*/
	public String toString() {
		return "My speed is " + speed;
	}
}
