package test.main;

import java.util.Random;

public class MainClass07 {

	/*
	 *  1. cherry, apple, banana, melon, 7
	 *  
	 *  5개의 문자열 중에서 한개가 랜덤으로 나오게 출력
	 */
	public static void main(String[] args) {
		
//		String[] items= {"cherry", "apple", "banana" , "melon" , "7"};
//			Random ran = new Random();
//			int ranNum=ran.nextInt(5);
//			System.out.println(items[ranNum]);
//	}
	
	
	
	/*
	 * 	5개 문자열 중에서 3개가 한줄에 한번에 랜덤 출력
	 *  ex ) cherry | apple | cherry
	 *  		7 | apple | melon
	 */
		
		//	랜덤하게 출력할 문자열을 미리 배열에 담아 놓는다.
		String[] items= {"cherry", "apple", "banana" , "melon" , "7"};
				// 랜덤한 숫자를 얻어내기 뒤한 객체
				Random ran = new Random();
				// 랜덤하게 얻어낸 3개의 정수를 저장할 배열
				int[] nums=new int[3];
				// 0~4 사이의 랜덤한 정수 3개 얻어내기
				for(int i=0; i < 3; i++) {
					// 랜덤한 정수를 얻어내서 배열에 저장
					int ranNum=ran.nextInt(5);
					nums[i]=ranNum;
					
					// 랜덤한 정수 3개 참조
//					int one=nums[0];
//					int two=nums[1];
//					int three=nums[2];
			}
				System.out.println(items[nums[0]]+" | "+ items[nums[1]]+" | " + items[nums[2]]+" | ");			
}

	
}

