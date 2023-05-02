package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Calc calc;
		
		calc = context.getBean("CalcAdd",CalcAdd.class);
		calc.calculate(25,36);
		
		calc = context.getBean("CalcMul",CalcMul.class);
		calc.calculate(25,36);

	}

}
