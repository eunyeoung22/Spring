package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SungJukInput implements SungJuk {
	private SungJukDTO2 sungJukDTO2 = null;
	private List<SungJukDTO2> list = null;

	public void setList(List<SungJukDTO2> list) {
		this.list = list;
	}

	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
		this.sungJukDTO2 = sungJukDTO2;
	}//또는 @Setter 롬복쓸 수 있다.

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************");
		System.out.print("1.이름 입력 :");
		String name = scan.next();
		System.out.print("2.국어점수 입력:");
		int kor = scan.nextInt();
		System.out.print("3.영어점수 입력 :");
		int eng = scan.nextInt();
		System.out.print("4.수학점수 입력 :");
		int math = scan.nextInt();
		System.out.println("************************");
		
		int tot = kor + eng + math;
		double avg = tot/3;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		//ArrayList<SungJukDTO2>list = new ArrayList<SungJukDTO2>();
		
		list.add(sungJukDTO2);
		
		
		System.out.println(name +"님의 데이터를 저장하였씁니다.");
	}

}
