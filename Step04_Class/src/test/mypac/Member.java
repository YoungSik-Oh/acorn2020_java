package test.mypac;

public class Member {
	//non static 필드
	public int num;
	public String name, addr;
//	public String addr;
	
	public void added() {  
		String name="원숭이";
		System.out.println(this.num + " | " + this.name + "| " + this.addr);

		
	}
	
}
