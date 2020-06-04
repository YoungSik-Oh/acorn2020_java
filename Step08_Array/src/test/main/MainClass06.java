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
		 * 
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
		
//		//Scanner 객체를 생성해서 참조값을 지역변수에 담기
//		Scanner scan= new Scanner(System.in);
//		
//		// 문자열(String) 5개르 담을 수 있는 배열 객체 생성해서 참조값을 지역변수에 담기
//		String[] msgs=new String[5]; 
//		
//		//5번 문자열을 입력 받기 위해 for 문을 구성한다.
//		for(int i=0; i<5; i++) {
//			System.out.println("문자열 입력:");
//			String str=scan.nextLine();
//			// 입력받은 문자열의 참조값을 배열에 순서대로 담기
//			msgs[i]=str;			
//		}
//		for(int i=0; i < msgs.length; i++) {
//			// i 번째 방에 있는 String 객체의 참조값을 불러온다.
//			String tmp=msgs[i];
//			// 콘솔에 출력한다
//			System.out.println(tmp);
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
//			for (int tmp:ran) {
//				System.out.println(tmp);
//			}
			for(int i=0; i < ran.length; i++) {
				System.out.println(ran[i]);
				
			}
			
	}

}
