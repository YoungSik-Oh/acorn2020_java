package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		Map<String,Object> map1=new HashMap<>(); //  key 값은 String , Value 값은 Integer 
		map1.put("num", 1);
		map1.put("name", "오영식");
		map1.put("addr", "용인");
		
		/*
		 * value 의 Generic 클래스가 Object로 지정 되어 있기 때문에
		 * 리턴되는 Object type을 원래 type으로 casting 해야한다.
		 */
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		String addr=(String)map1.get("addr");
	}
}
