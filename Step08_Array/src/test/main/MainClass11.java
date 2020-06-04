package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 * 	[ 컴퓨터와 가위 바위 보 하기]
 * 
 * 	가위(1) 바위(2) 보(3) :s
 * 
 * 	나: 가위 VS 컴터 : 보
 * 
 *  WIN (draw or lose)~ 
 */
public class MainClass11 {
	public static void main(String[] args) {
	
//		Random ran=new Random();
//		
//		Scanner scan=new Scanner(System.in);
//		
//		String[] al= {"가위","바위","보"};
//		String[] win= {"Win","draw","Lose"};
//		int[] nums=new int[3];
//	
//		System.out.println("얼른내시오");
//		
//		for (int i=0; i < al.length; i++) {
//			int ranNum=ran.nextInt(3);
//			String str=scan.nextLine();
//			nums[i]=ranNum;		
//			
//			System.out.println(al[nums[i]]);
		// 가위 바위 보 문자열을 일단 배열에 담기
		String[] items= {"가위", "바위","보"};
		// 사용자 입력을 받아야함 
		Scanner scan=new Scanner(System.in);
		// 컴퓨터가 랜덤하게 가위, 바위, 보 정해야함
		Random ran=new Random();
		
		//1. 사용자 입력을 받아야함
		System.out.println("가위 (s) 바위(r) 보(p) 입력: ");
		String userInput = scan.nextLine(); // s=0 r=1 p=2
		// 2. "s" 는 0, "r" 은 1, "p"는 2로 바꿔야함
		int me=0;
		if(userInput.equals("s")) {
			me=0;
		}else if(userInput.equals("r")){
			me=1;
		}else if(userInput.equals("p")){
			me=2;
		}
		//3. Computer 도 랜덤하게 하나의 숫자를 부여 받음 (0,1,2)
		int com=ran.nextInt(3);
		
		// win, lose, draw 문자열 담을 변수 미리 만듦
		String result=null;
		
		// 4. 승패 판단
		if( (me == 0 && com == 2 || (me==1 && com==0) || me==2 && me==1) ) { // 내가 이길때 // 내가 가위 (0) 일때 , com이 보 (2) 일때 
			result="win";
		}else if(me == com) { // 비긴경우
			result="draw";
		}else { // 내가 진 경우System.out.println("짐");
			result="lose";
		}
		System.out.println("나:" + items[me] + "vs 컴 :" + items[com]);
		System.out.println(result);
	}
		
}

