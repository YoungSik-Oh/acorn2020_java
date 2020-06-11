package tset.main;

import java.util.Scanner;
/*
 * 	RuntimeException 을 상속 받은 Exception 종류는
 * 	try ~ catch 블럭으로 묶어주지 않아도 문법 오류가 발생하지 않는다.
 * 	따라서 필요시 선택적으로 try ~ catch 블럭으로 묶어주면 된다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner	scan=new Scanner(System.in);
		
		System.out.println("나눌수 입력:");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는 수 입력:");
		String inputNum2=scan.nextLine();
		try {
			double num1=Double.parseDouble(inputNum1);
			double num2=Double.parseDouble(inputNum2);
			
			double result=num2/num1;
			
			System.out.println(num2+" 를" + num1 +" 으로 나누면:" +result);
		}catch(NumberFormatException nfe){
			System.out.println("제대로 입력해라 마 ! ");
		}catch(ArithmeticException ac){
			ac.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception 이 발생");
		}finally {// 예외가 발생 하던 안ㅇ하던 반드시 실행이 보장되는 블럭
			System.out.println("무언가 마무리 작업");
		}
		System.out.println("main메소드 종료");

	}

}
