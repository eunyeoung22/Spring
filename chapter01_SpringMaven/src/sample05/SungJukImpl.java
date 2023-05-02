package sample05;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	

	public SungJukImpl(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math= math;
	}

	@Override
	public void calc() {
		total = kor + eng + math;
		avg = (kor + eng + math)/3;
	}

	@Override
	public void display() {
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng +"\t"+ math + "\t" + total + "\t"+ avg);

	}

}
