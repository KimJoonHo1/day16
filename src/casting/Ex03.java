package casting;


class AAA {
	public String getText() {
		return "AAA클래스";
	}
}
public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a = new AAA();
		AAA aa = (AAA) a;
		String dd = aa.getText();
		System.out.println(dd);
	
	}

}
