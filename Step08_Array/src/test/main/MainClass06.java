package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass06 {

	public static void main(String[] args) {
		/*
		 * 	Scanner 객체를 이용해서 문자열을 5번 입력 받는다.
		 * 	입력 받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 * 	모두다 입력 받은 후 for 문을 이용해서 배열에 저장된 
		 * 	모든 문자열을 콘솔창에 순서대로 출력해라
		 * 
		 */
		
//		String[] input = new String[5];
//		
//		for(int i= 0; i< input.length; i++) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("입력하십시오");
//			String str = scan.nextLine();
//			input[i] = str;	
//		}
//		for(int i= 0; i< input.length; i++) {
//			System.out.println(input[i]);
//		
//		}
		
		
				
		
		/*
		 * 	2.Random 객체를 이용해서 로또 번호 6개 랜덤하게 얻어내서
		 * 	배열에 저장
		 * 	모두다 저장이 되면 for 문을 이용해서 배열에 저장된 모든 로또 번호를
		 * 	콘솔창에 순서대로 출력하는 코드를 작성
		 */
		
		
			int[] ran=new int[6];
			for(int i=0; i < ran.length; i++) {
				Random r=new Random();
				int lottoNum=r.nextInt(45)+1;
				ran[i]=lottoNum;
			}
			for(int i=0; i < ran.length; i++) {
				System.out.println(ran[i]);
			}
			
	}

}
