package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1= new Joinner() {
			@Override
			public String join(String first, String second) {
				return first+second;
			}
		};
		String result1=j1.join("김", "구라");
		System.out.println(result1);
		
		Joinner j2=(first, second)->{return first+second;};
		String naems=j2.join("해골", "원숭이");
		System.out.println(naems);
		
		Joinner j3=(first, second)->first+second;
		String result3=j3.join("주", "뎅이");
		
	}

}
