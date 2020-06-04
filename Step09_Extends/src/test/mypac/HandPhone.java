package test.mypac;

// Phone 클래스를 상속 받은 HandPhone 클래스
public class HandPhone extends Phone{
	// 생성자
	public HandPhone() {
		System.out.println("HandPhone() 생성자 호출됨");
	}
	//메소드
	public void mobileCall() {
		System.out.println("이동중 전화검");
	}
	// 사진을 찍는 메소드
	public void takePicture() {
		System.out.println("김치 ~ ");
	}
}
