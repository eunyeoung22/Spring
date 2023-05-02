package sample04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component//applicationContent.xml에서 빈 설정된 값을 지우고 Component로 설정 
@Scope("prototype")
@Getter
@Setter
public class SungJukDTO2 {
	private String name;
	private int Kor, eng, math;
	private int tot;
	private double avg;
	@Override
	public String toString() {
		return name + "\t" + Kor + "\t" + eng + "\t" + math + "\t" + tot +"\t" +  avg;
	}
	
	
}
