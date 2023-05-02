package sample05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample04.CalcAdd;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 입력 : ");
		int math = sc.nextInt();
		
		//SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl",name,kor,eng,math);
		
		SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl", name , kor, eng, math);
		sungJuk.calc();
		sungJuk.display();

	}

}
