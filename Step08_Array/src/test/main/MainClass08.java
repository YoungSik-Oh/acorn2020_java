package test.main;

import java.util.Random;

<<<<<<< HEAD
/*   
 *   hint 
 *   
 *   String[] items={"cherry", "apple", "banana", "melon", "7"};
 *  
 *   1. cherry, apple, banana, melon, 7
 *      5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
 *   
 *   2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
 *      예)  cherry | apple | cherry
 *           7 | apple | melon
 *           7 | 7 | 7
 *      
 */
public class MainClass08 {
	public static void main(String[] args) {
		//렌덤하게 출력할 문자열을 미리 배열에 담아 놓는다. 
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//렌덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//0~4 사이의 렌덤한 정수 얻어내기
		int ranNum=ran.nextInt(5);
		
		System.out.println(items[ranNum]);
	}
}







=======
public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  cheery, apple, banana,melon,7
		 *   10, 20, 30,40,1000
		 *   5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요
		 *   다 같아야 점수
		 *   ex) cherry | cherry | cherry 
		 *   10 점 
		 *   
		 *    apple | apple |apple 
		 *    20 점
		 *    
		 */
		
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

