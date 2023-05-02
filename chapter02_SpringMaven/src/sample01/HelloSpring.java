package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml"); 
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl");
		messageBean.sayHello();
		messageBean.sayHello("복숭아" , 12000);
		messageBean.sayHello("수박" , 20000, 2);
	}

}
