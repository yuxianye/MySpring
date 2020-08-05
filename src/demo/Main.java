package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext

public class Main {
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext a = new ClassPathXmlApplicationContext("classpath:/application.xml");
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) a.getBean("helloWorld");
	    helloWorld.say();
	  
	}
 
}