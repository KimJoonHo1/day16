package day16;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Win7 extends Time {
	public HashMap<String, String> map = new HashMap<>();

	public Win7() {
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
	}

	public void window() throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1.기능 2.off");
		System.out.print(">>>> ");
		int sel = scanner.nextInt();
		switch (sel) {
		case 1:
			System.out.println("실행 가능 파일 : [메모장, 계산기]");
			System.out.print(">>>> ");
			String file = scanner.next();
			if (map.containsKey(file)) {
				Runtime run = Runtime.getRuntime();
				Process pro = run.exec(map.get(file));
				pro.waitFor();
			} else {
				System.out.println("없는 파일입니다.");
			}
			break;
		case 2:
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
