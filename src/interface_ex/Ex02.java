package interface_ex;

import java.util.Scanner;

class B지상군 implements A공방{
	
	public void 총알구비() {
		System.out.println("총알을 장전합니다.");
	}
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격합니다.");
	}
	public void 방패착용() {
		System.out.println("방패를 사용합니다.");
	}
	public void defense() {
		방패착용();
		System.out.println("지상군이 방어합니다.");
	}
}

class B공군 implements A공방{
	
	public void 총알구비() {
		System.out.println("총알을 장전합니다.");
	}
	public void attack() {
		총알구비();
		System.out.println("공군이 공격합니다.");
	}
	public void 방패착용() {
		System.out.println("방패를 사용합니다.");
	}
	public void defense() {
		방패착용();
		System.out.println("공군이 방어합니다.");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		A공방 공방 = null;
		
		System.out.println("적이 쳐들어 왔습니다.");
		System.out.println("1.지상군 2.공군");
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 1) {
			System.out.println("지상군 선택");
			공방 = new B지상군();
		} else {
			System.out.println("공군 선택");
			공방 = new B공군();
		}
		
		System.out.println("1.공격 2.방어");
		choice = scanner.nextInt();
		
		if(choice == 1) {
			공방.attack();
		} else {
			공방.defense();
		}
		
	}
}
