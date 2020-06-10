package test.main;

import test.mypac.Rect;

public class MainClass05 {

	public static void main(String[] args) {
		// 1. Rect 객체를 담을 수 있는 방 3개짜리 배열 객체를 생성해서 참조값을
		// rects 라는 이름의 지역 변수에 담기
		
		// 2. 배열에 Rect 객체 3개를 순서대로 담기
		
		// 3. 반복문 for 문을 이용해서 각각 사각형의 면적을 콘솔창에 출력

		Rect[] rects=new Rect[3];
		
		rects[0]=new Rect(10,20);
		rects[1]=new Rect(20,30);
		rects[2]=new Rect(40,50);
		
		for(int i=0; i<rects.length; i++) {
			int a=rects[i].getArea();
			System.out.println(a);
			
			
		}
	}

}
