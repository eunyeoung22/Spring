package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml"); 
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");//부모클래스로 받아줘야함
		messageBean.sayHello("Spring");
		MessageBean messageBean2 = context.getBean("messageBean",MessageBean.class);//
		messageBean2.sayHello("Spring");
		MessageBean messageBean3 = (MessageBean) context.getBean("messageBean");
		messageBean3.sayHello("Spring");
	}

}
