package interface_ex;

interface Test {
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static String id = "홍길동";
	public static String pwd = "12345";
}

class Test01 implements Test {
	
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.id);
		System.out.println(Test.pwd);
	}

}
