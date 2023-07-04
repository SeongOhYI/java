package ex01;

public class Operation {
	public static void run() {
		//산술연산자 (+, -, *, /, %)
		int kor=59;
		int eng=58;
		int mat=100;
		int sum=kor + eng + mat;
		double avg=sum/3.;
		System.out.printf("국어: %d\n" , kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("총점: " + sum);
		System.out.printf("평균: %.2f\n", avg);
		
		//관계연산자 ( >, >=, <, <=, ==, !=)
		//삼항연산자
		//논리연산자(&&, ||, !)
		//증감연산자(++, --)
		String pass=(kor >=60 && eng >=60 && mat >=60 && avg >=70) ? "합격" : "불합격";
		System.out.println("결과: " + pass);
		
		int count=0;
		if(kor<60) count++;
		if(eng<60) count++;
		if(mat<60) count++;
		
		System.out.println("누락과목수: " + count);
		
		
}
}
