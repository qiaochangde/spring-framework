package org.springframework;

import org.springframework.component.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.vo.Person;
import org.springframework.vo.SimpleBean;

public class ApplicationTest {

	public static void main(String[] args) {

		configTest();
	}

	public static void configTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		UserController userController = (UserController) context.getBean("userController");
		System.out.println(userController.hello());

		context.close();
	}

	public static void xmlTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName());

		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();

		context.close();
	}
}
