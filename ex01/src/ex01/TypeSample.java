package ex01;

public class TypeSample {
	public static void run() {
		//숫자변수타입
				int num1=80;
				float num2=80.5f; //4byte
				double num3=80.5; //8byte(float보다 큰수, 정밀한 수)
				
				//문자변수타입
				char str1='A'; //(작은따옴표)
				String str2="ABCD"; //대문자로 시작하기 때문에 class개념이다.(큰따옴표)
				
				//Boolean
				boolean isEnd=true; //or false;
				
				System.out.print("num1=" + num1 + "\n\n"); // 줄바꿈ln
				System.out.println("num2=" + num2);
	}

}
