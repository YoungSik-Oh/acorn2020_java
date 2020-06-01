package test.mypac;
/*
 * [ method를 만들 때 고려 해야 하는 것]
 * 
 * 	1. 접근 지정자
 * 	2. 리턴 type
 * 	3. method name
 * 	4. method에 전달하는 인자의 갯수와 데이터 type
 */
public class MyObject {
	/*
	 *  public => 이 메소드는 어디서든 접근 가능
	 *  void => 이 메소드는 어떤값도 리턴하지 않음
	 *  walk => method name
	 *  walk =>  이 메소드는 어떤값도 전달 받지 않는다.
	 */
	public void walk() { // public = 접근 지정자 // void = 리턴 안한다// walk() = method name 
		System.out.println("뚜 벅 뚜 벅 뚜뚜 벅 뚜벅이");
		
	};
	//	int type 을 리턴해주는 메소드
	public int getNumber() {
		int myNum=10;
		//int type 을 리턴해 주어야 문법이 성립한다.
		return myNum;
	};
	
	//String type 을 리턴해주는 메소드
	public String getGreeting() {
		String greet="안녕하세요";
		return greet;
	};
	public Car getCar() {
		Car c1=new Car();
		return c1;
	};
	// int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) { // int num = 지역변수
		System.out.println("num:" + num);
	};
	// String type 을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println("name:"+ name);
	};
	// Car type 을 메소드의 인자로 전달 받는 메소드
	public void useCar(Car car) {
		car.drive();
	}
	// String type 과 Car type 을 메소드의 인자로 전달받는 메소드
	public void useSome(String name, Car car) {
		System.out.println("name:"+name);
		car.drive();
	}
	//Radio type 과 Speaker type 을 전달 받는 메소드
	public void doSome(Radio r, Speaker s) {
		//System.out.println("doSome() 메소드가 호출되었습니다.");
		System.out.println("ㅋㅋㅋㅋ");
	}
	public void have(Gfriend g) {
		System.out.println("없음?");
	}
};
