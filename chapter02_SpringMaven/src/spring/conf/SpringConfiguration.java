package spring.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample04.SungJukDTO2;


@Configuration//환경설정 파일
public class SpringConfiguration {
	//sample01
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	//sample02
	@Bean
	public CalcAdd calcAdd(){
		return new CalcAdd(25,36);
	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul(){
		return new CalcMul();
	}
//	@Bean
//	public CalcMul calcMul(){
//		return new CalcMul();
//	}
	
	//sample04
	@Bean(name="arrayList")
	public ArrayList<SungJukDTO2> arrayList (){
		return new ArrayList<SungJukDTO2>();
	}
}


/* 
 @Bean 
  - 메소드에서 return되는 값을 빈으로 생성 한다.
  - 메소드의 이름은 반드시 빈의 id명으로 해야한다.
 */
