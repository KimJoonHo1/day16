package casting;

class Parents {
	public void familyName() {
		System.out.print("이 ");
	}
	public void name() {
		familyName();	
		System.out.println("순신");
	}
}

class Daughter extends Parents {
	public void name() {
		familyName();	
		System.out.println("국주");
	}
}

class Son extends Parents {
	public void name() {
		familyName();	
		System.out.println("기광");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p = new Parents();
		p.name();
		Daughter d = new Daughter();
		d.name();
		Son s = new Son();
		s.name();
		
		p = d;
		p.name();
		p = s;
		p.name();
		
	}

}
