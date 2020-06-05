package test.extends2;

public class Men extends person{
	//생성자
//	public Men() {
//		 // 부모 생성자에 필요한 값을 전달한다.
//	}

	public Men(Blood blood) {
		super(blood); // 부모 생성자에 필요한 값을 전달한다.
	}
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}
}
