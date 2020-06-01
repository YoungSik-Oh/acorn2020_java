package test.mypac;

public class Computer {
	// field 
	public Cpu cpu;
	// constructor
	public Computer (Cpu cpu) {
		this.cpu=cpu;
	}
	//method
	public void doGame() {
		if(this.cpu==null) {
			System.out.println("Cpu가 없어서 컴퓨터가 동작 안함요");
			return;// 메소드 끝내기
		}
		System.out.println("Game!");
	}
}
