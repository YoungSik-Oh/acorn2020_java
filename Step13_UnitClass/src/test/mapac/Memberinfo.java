package test.mapac;

public class Memberinfo {
	
	// 필드
	public int num;
	public String name,addr;
	
	// deafult  생성자
	public Memberinfo() {
		
	}
	
	
	// 생성자의 인자로 번호,이름,주소를 전달 받을수 있도록 한다.
	public Memberinfo(int num, String name, String addr) {
		// 생성자의 인자로 전달된 값을 필드에 저장한다.
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}
