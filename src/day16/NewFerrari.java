package day16;

public class NewFerrari extends Ferrari {
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	
	public void autoSystem() {
		System.out.println("자동 운전 모드를 시작합니다.");
	}
	public void speed() {
		super.speed();
		System.out.println("터보 엔진으로 동작합니다");
	}
}
