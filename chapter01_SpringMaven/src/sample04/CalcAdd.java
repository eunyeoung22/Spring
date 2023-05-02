package sample04;

import org.springframework.stereotype.Component;

@Component("calcAdd")//클래스 명과 동일할 경우엔 ("")는 생략 가능
public class CalcAdd implements Calc {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x + "+"+ y + "=" + (x+y));

	}

}
