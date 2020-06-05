package test.extends2;

public class Blood {
	// 필드
	private String rh;
	private String type;
	// 생성자
	public Blood(String rh, String type) {
		this.rh=rh;
		this.type=type;
	}
	/*
	 * 	필드를 선언하고 나서 get 을 타이핑 후 ctrl + space 키를 누르면
	 * 	eclipse 가 getter 메소드를 자동으로 만들어 줄 준비를 한다.
	 * 
	 */
	// 필드에 저장된 rh 를 리턴 해주는 getter 메소드
	public String getRh() {
		return rh;
	}
	// 필드에 저장 된 type 을 리턴 해주는 getter 메소드
	public String getType() {
		return type;
	}
}
