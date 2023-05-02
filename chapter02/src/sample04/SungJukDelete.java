package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;//주소값 받아오기
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름 입력: ");
		String name = scan.next();
		
		//iterator를 사용하여 list안 목록 하나하나를 찾아서 true/false 값 반환
		Iterator<SungJukDTO2> it = list.iterator();
		int sw = 0;
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();//it가 가리키는 곳의 항목을 꺼내서 저장한 후 it는 다음 항목으로 이동
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				it.remove();//따로 보관한(sungJukDTO2) 목록을 제거
				System.out.println(name + "님의 데이터를 삭제하였습니다.");
			}
		}//while
		if(sw==0) System.out.println("찾고자하는 이름이 없습니다.");
		
	}

}
