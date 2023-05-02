package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	@Autowired
	@Qualifier("arrayList")//List부모에 걸려있는 자식이 여럿이기 때문에 정확하게 명시해줘야한다.
	private List<SungJukDTO2> list = null;
	//private ArrayList<SungJukDTO2> list = null;

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
