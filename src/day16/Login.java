package day16;

import java.util.HashMap;
import java.util.Scanner;

public class Login extends Win7 {
	private HashMap<String, String> user = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	
	public void login() {
		// super.timeStop();
		System.out.println("로그인창이 실행됩니다.");
		while(true) {
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			System.out.print(">>>> ");
			int sel = scanner.nextInt();
			switch(sel) {
				case 1:
					System.out.print("아이디 입력 >>> ");
					String userId = scanner.next();
					System.out.print("비밀번호 입력 >>> ");
					String userPwd = scanner.next();
					if(map.containsKey(userId)) {
						if(userPwd.equals(map.get(userId))) {
							System.out.println("로그인이 되셨습니다!");
							try {
								Time time = new StopWatch();
								time.setDaemon(true);
								time.start();
								super.window();
								time.timeStop(false);
							} catch(Exception e) {
								System.out.println("에러 : " + e);
							}
							
						} else {
							System.out.println("아이디 또는 비밀번호가 틀립니다.");
						}
					} else {
						System.out.println("아이디 또는 비밀번호가 틀립니다.");
					}
					break;
				case 2:
					System.out.print("아이디 입력 >>> ");
					String joinId = scanner.next();
					System.out.print("비밀번호 입력 >>> ");
					String joinPwd = scanner.next();
					if(!map.containsKey(joinId)) {
						map.put(joinId, joinPwd);
						System.out.println("회원가입이 완료되었습니다.");
					} else {
						System.out.println("이미 가입된 회원입니다.");
					}
					break;
				case 3:
					System.out.println("종료합니다.");
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다.");
					System.exit(1);
			}
		}
	}
}
