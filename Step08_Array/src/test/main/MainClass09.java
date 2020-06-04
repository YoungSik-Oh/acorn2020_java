package test.main;

import java.util.Random;
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



