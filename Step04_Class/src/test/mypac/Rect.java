package test.mypac;
public class Rect {
	// non static 필드
	public int width;
	public int height;
	
	// 사각형의 면적을 리턴해주는 non static 메소드
	public int getArea() { // int로 잡았으니 int로 리턴값이 돌아간다.
		int area=this.width * this.height;
		return area;
		
	}
	
}
