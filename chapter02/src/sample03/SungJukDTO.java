package sample03;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SungJukDTO {
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
	
}


