package test.main;

import test.mypac.Gfriend;
import test.mypac.Messenger;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass05 {

	public static void main(String[] args) {
		/*
		 * 	test.mypac 패키지에 다양한 모양의 메소드를 가지는
		 * 	클래스를 정의하고
		 * 	그클래스를 이용해서 객체도 생성하고 메소드도 호출해보세요.
		 */
		MyObject y=new MyObject();
		Radio r = new Radio();
		Speaker s = new Speaker();
		y.have(new Gfriend());
		y.doSome(r, s);
		
	}

}
