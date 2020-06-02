package test.mypac;

public class Computer {
	// field 
	public Cpu cpu;
	// 기본 생성자(인자로 아무것도 전달 받지 않는 생성자)
	public Computer () {
		System.out.println("기본 생성자가 호출 되었쓰ㅃ니따 ");
	}
	// constructor
	public Computer (Cpu cpu) {
		this.cpu=cpu;
	}
	//method`
	public void doGame() {
		if(this.cpu==null) {
			System.out.println("Cpu가 없어서 컴퓨터가 동작 안함요");
			return;// 메소드 끝내기
		}
		System.out.println("Game!");
	}
}
