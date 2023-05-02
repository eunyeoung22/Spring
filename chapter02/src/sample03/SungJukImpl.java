package sample03;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private SungJukDTO sungJukDTO = null;
	
	public SungJukImpl(SungJukDTO sungJukDTO) {
		this.setSungJukDTO(sungJukDTO);
	}
	
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
