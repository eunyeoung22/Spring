package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MessageBeanImpl implements MessageBean {
	
	private String str;
	
	@Autowired	
	public void setStr(@Value("Have a nice day!!")String str) {
		this.str = str;
	}

	@Override
	public void showPrintBefore() {
		System.out.println("showPrintBefore 메세지 =" + str);//핵심 코드

	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore 메세지 =" + str);//핵심 코드
	}


	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter 메세지 =" + str);//핵심 코드

		
	}

	@Override
	public void viewPrintAfter() {
		System.out.println("viewPrintAfter 메세지 =" + str);//핵심 코드
		
	}

	@Override
	public void showPrint() {
		System.out.println("showPrint 메세지 =" + str);//핵심 코드
		
	}
	@Override
	public String viewPrint() {
		System.out.println("viewPrint 메세지 =" + str);//핵심 코드
		return "스프링";
		
	}


	@Override
	public void display() {
		System.out.println("display 메세지 =" + str);//핵심 코드
	}
}
