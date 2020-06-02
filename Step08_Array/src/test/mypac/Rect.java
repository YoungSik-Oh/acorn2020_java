package test.mypac;

public class Rect {
	// field
	public int width;
	public int height;
	// constructor
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
		
	}
	// 사각형의 면적을 반환하는 메소드
	public int getArea() {
		return width*height;
	}
}
