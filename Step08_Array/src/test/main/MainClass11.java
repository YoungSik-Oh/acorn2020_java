package test.main;

import java.util.Random;
import java.util.Scanner;

<<<<<<< HEAD
public class MainClass11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//외형상 무한 루프
		while(true) {
			System.out.print("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			if(str.equals("q")) {//무한 루프 탈출 조건
				break; //while  문 탈출
			}
			//이전 예제에서 작업한 내용을 static 메소드에 이동 시키고 해당 메소드 호출하기 
			MainClass11.doGame();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	public static void doGame() {
		//렌덤하게 출력할 문자열을 미리 배열에 담아 놓는다. 
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//렌덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//렌덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		//0~4 사이의 렌덤한 정수 3개 얻어내기
		for(int i=0;i<3;i++) {
			//렌덤한 정수를 얻어내서 
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum; //배열에 저장한다 
		}
		//렌덤한 정수 3개 참조
		int one=nums[0];
		int two=nums[1];
		int three=nums[2];
		//출력할 문자열 구성하기
		String line=items[one]+" | "+items[two]+" | "+items[three];
		//출력하기 
		System.out.println(line);
		//부여할 점수를 미리 배열에 담아 놓는다. 
		int[] points= {10, 20, 30, 40, 1000};
		//nums 배열에 있는 3개의 숫자가 모두 같은지 비교해 본다.
		if(nums[0]==nums[1] && nums[1]==nums[2]) {//3개가 모두 같은 경우
			//점수를 부여해야 한다 . 몇점이지?
			//nums  배열에 있는 숫자 3개가 다 같으므로 아무거나 하나를 읽어와서
			//점수를 얻어낸다
			int point=points[nums[0]];
			System.out.println(point+"점 입니다.");
		}else {//하나라도 다른 경우
			// 0 점
			System.out.println("0점 입니다.");
		}		
	}
}







=======
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
>>>>>>> refs/remotes/myorigin/study

