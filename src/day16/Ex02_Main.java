package day16;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다.");
	}
	
	@Override
	public Object get(int i) {
		return "내가만든 get이다";
	}
}

final class BB {
	String s = new String();
	String ss;
	public void testT() {
		
	}
}

public class Ex02_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		a.add("안녕하세요.");
		System.out.println("저장값 : " + a.get(0));
	}

}
