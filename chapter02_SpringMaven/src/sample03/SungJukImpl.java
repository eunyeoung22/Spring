package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	@Autowired
	private SungJukDTO sungJukDTO = null;
	//@Component로 생성산 빈들 중에서 SungJukDTO 클래스를 자동으로 찾아서 값을 얻어오기
	
	//public SungJukImpl(SungJukDTO sungJukDTO) {
	//	this.setSungJukDTO(sungJukDTO);
	//}생략가능
	
	@Override
	public void calcTot() {
		sungJukDTO.setTotal(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());

	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg((double)sungJukDTO.getTotal()/3);
	}

	@Override
	public void display() {
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO.getName() +"\t"
						  + sungJukDTO.getKor() + "\t" 
						  + sungJukDTO.getEng() + "\t"
						  + sungJukDTO.getMath() + "\t"
						  + sungJukDTO.getTotal() + "\t" 
						  + String.format("%.2f",sungJukDTO.getAvg()));

	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.println("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.println("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.println("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		

	}

	public SungJukDTO getSungJukDTO() {
		return sungJukDTO;
	}

	public void setSungJukDTO(SungJukDTO sungJukDTO) {
		this.sungJukDTO = sungJukDTO;
	}



}
