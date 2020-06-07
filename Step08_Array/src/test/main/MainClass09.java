package test.main;

import java.util.Random;
<<<<<<< HEAD

public class MainClass09 {
	public static void main(String[] args) {
		
		/*  cherry, apple, banana, melon, 7 
		 * 
		 * 	5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
		 *    예)  cherry | apple | cherry
		 *         7 | apple | melon
		 *         7 | 7 | 7
		 *      
		 */
		
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
	}
}


=======
import java.util.Scanner;

public class MainClass09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 외형상 무한루프
		while(true) {
			System.out.print("종료(q) 계속 (enter):");
			String str=scan.nextLine();
			if(str.equals("q")) { // 무한 루프 탈출조건
				break; // while 문 탈출
			}
			System.out.println("무언가 작업 합니다");
			// 이전예제에서 작업한 내용을 static 메소드에 이동 시키고 해당 메소드 호출하기
			MainClass09.doGame();
			
		}
		System.out.println("main 메소드가 종료됩니다.");

	}
	public static void doGame() {
		Random ran=new Random();
		String items[] = {"cheery", "apple", "banana" , "melon" ,"7"};
		int[] nums=new int[3];
		int[] points = {10,20,30,40,1000};
				for(int i=0; i < 3; i++) {
					int ranNum=ran.nextInt(5);
					nums[i]=ranNum;
			}
				System.out.println(items[nums[0]]+" | "+ items[nums[1]]+" | " + items[nums[2]]);
				if(nums[0]== nums[1] && nums[1]== nums[2]) {
					
					int point=points[nums[0]];
					
//					if(items[nums[0]] == "cheery") {
//						System.out.println(point+"점");
//					}else if(items[nums[0]] == "apple") {
//						System.out.println(point+"점");
//					}else if(items[nums[0]] == "banana") {
//						System.out.println(point+"점");
//					}else if(items[nums[0]] == "melon") {
//						System.out.println(point+"점");
//					}else if(items[nums[0]] == "7") {
//						System.out.println(point+"점");
//					}	
					}else {
					System.out.println("0점 임미다");
					}
					
				}
		
	}
>>>>>>> refs/remotes/myorigin/study



