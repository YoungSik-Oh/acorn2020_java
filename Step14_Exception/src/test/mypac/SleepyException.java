package test.mypac;
/*
 * 
 * 	사용자 정의 Exception 도 만들수 있다.
 * 	실행시 발생하는 Exception 은 RuntimeException 을 상속ㄱ 받아서 만들면된다.
 */
public class SleepyException extends RuntimeException {

	public SleepyException(String msg) {
		super(msg);
	}
	
	
}
