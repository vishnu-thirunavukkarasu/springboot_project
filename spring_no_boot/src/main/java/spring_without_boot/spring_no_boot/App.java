package spring_without_boot.spring_no_boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
   

	public static void main(String[] args) {
    
      //String configLocation = "/java/resources/config.xml";
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Dev obj =(Dev) context.getBean("Dev");
      obj.test();
    }
}
