package test.mypac;

@FunctionalInterface // method를 한 개만 가지도록 강제적으로 하는것 / public void a(); 불가 
public interface Joinner {
	// 전달 되는 두 문자열을 연결해서 리턴하는 메소드
	public String join(String first, String second);
	
}
